package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Student;

import com.api.service.StudentService;


@RestController
public class HelloController {
	
	@Autowired
	StudentService service;
	//Rest API
	
	//1.localhost:8989/Student/students
	@GetMapping("/students")
	public List getAllTask() {
		return service.getAllTask();
	}
	//2.localhost:8989/Student/add
	@PostMapping(value="/add", consumes="application/json")
	public void addNewTask(@RequestBody Student student) {
		
		service.addTask(student);
	}
	
}