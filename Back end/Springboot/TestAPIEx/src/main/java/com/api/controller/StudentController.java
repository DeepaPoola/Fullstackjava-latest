package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.service.StudentService;

@RestController
public class StudentController {
  
	@Autowired
	StudentService service;
	
	//get student
	//localhost://8989/Student/students
	@GetMapping("/students")
	public List getStudent()
	{
		return service.getAllStudent();
		
	}
	
}

