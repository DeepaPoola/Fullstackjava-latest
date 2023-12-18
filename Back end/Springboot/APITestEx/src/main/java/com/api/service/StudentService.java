package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Student;
import com.api.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepo;
	//Performing CRUD Operations
	//1.Get All Task   - Read
	public List	 getAllTask() {
		List<Student> student = new ArrayList();
		studentRepo.findAll().forEach(student::add);
		return student;
	}
	//2.add Task    - create
	public void addTask(Student student){
		studentRepo.save(student);
	}

		
	}
	
	
