package com.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Employee;
import com.api.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepo;
	//get all employee
	public List getAllEmployee() {
		List employee=new ArrayList();
		employeerepo.findAll().forEach(employee::add);
		return employee;	
	}
	//add employee
	public void addAllEmployee(Employee employee) {
		employeerepo.save(employee);
	}

}
