package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.crm.dao.RegistrationDaoImpl;
import com.crm.model.CustomerBean;
import com.crm.service.EmailService;

@Controller
public class CrmController {
   
	@Autowired
	RegistrationDaoImpl regdao;
	
	@Autowired
	EmailService emailservice;
	
	@GetMapping("/index")
	public String getIndexPage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String getRegistrationPage(Model model) {
		CustomerBean customerBean =new CustomerBean();
		model.addAttribute("custBean",customerBean);
		return "registration";
	}
	
	@PostMapping("/save")
	public String registercustomer(@ModelAttribute("custBean")CustomerBean customerBean) {
		System.out.println(customerBean.getFirstName());
		System.out.println(customerBean.getEmail());
		System.out.println(customerBean.getMobile());
		System.out.println(customerBean.getPassword());
		boolean flag = regdao.saveCustomer(customerBean);
		System.out.println(flag);
		
		if(flag == true) {
			//send email to customer
			emailservice.sendmailtoUser(customerBean.getEmail(),customerBean.getFirstName());
		}
		return "success";
	}
	
}
