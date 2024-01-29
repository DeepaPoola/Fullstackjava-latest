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
	//get all student
	public List getAllStudent() {
		List student=new ArrayList();
		studentrepo.findAll().forEach(student::add);
		return student;	
	}
	//add student
	public void addAllStudent(Student student) {
		studentrepo.save(student);
	}
	//update student
	public Student updateStudent(Student student,Long rollno) {
		Student student1= studentrepo.findById(rollno).get();
		return studentrepo.save(student1);
		
		
	}

}
