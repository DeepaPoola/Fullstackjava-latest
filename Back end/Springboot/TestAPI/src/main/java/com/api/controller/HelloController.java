package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Student;

@RestController
public class HelloController {
 
	@Autowired
	Student student;
	
	@GetMapping("students")
	public Student getstudent() {
		return student;
		
	}
	@PostMapping("students/create")
	public List<Student> createDetails() {
		student.add(student);
		
		
	}
}
