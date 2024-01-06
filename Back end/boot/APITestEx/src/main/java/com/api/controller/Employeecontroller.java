package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Employee;
import com.api.service.EmployeeService;

@RestController
public class Employeecontroller {
	
	@Autowired
	EmployeeService employeeservice;
	
	//localhost:8282/Employee/employees
	@GetMapping("/employees")
	public List getEmployee() {
		return employeeservice.getAllEmployee();
		
	}
	//localhost:8282/Employee/add
	@PostMapping("/add")
	public void addEmployee(@RequestBody Employee employee) {
		 employeeservice.addAllEmployee(employee);
	}

}
