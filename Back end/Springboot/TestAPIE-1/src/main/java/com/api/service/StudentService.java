package com.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Student;
import com.api.repository.StudentRepository;

@Service
public class StudentService {
   
	@Autowired
	StudentRepository studentrepo;
	
	public List getAllStudent() {
		List<Student> student=new ArrayList();
		studentrepo.findAll().forEach(student::add);
		return student;
	}
	
	public void addStudent(Student student) {
		studentrepo.save(student);
	}
}

