package com.crm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.repository.StudentRepository;

@Service
public class StudentService {

	
	@Autowired
	StudentRepository repo;
	
	public List getAllStudents() {
		List student=new ArrayList();
		repo.findAll().forEach(student::add);
		return student;
	}
}
