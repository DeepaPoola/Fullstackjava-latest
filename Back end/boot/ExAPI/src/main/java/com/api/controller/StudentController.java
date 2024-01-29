package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Student;
import com.api.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentservice;
	
	//localhost:8080/Student/students
	@GetMapping("/students")
	public List getStudent() {
		return studentservice.getAllStudent();	
	}
	//localhost:8080/Student/add
	@PostMapping("/add")
	public void addStudent(@RequestBody Student student) {
		studentservice.addAllStudent(student);
	}
	//localhost:8080/Student/update/rollno
	@PutMapping("/update/{rollno}")
	public void updateAllStudent(@RequestBody Student student,@PathVariable Long rollno)
	{
		studentservice.updateStudent(student, rollno);
	}
	
}
