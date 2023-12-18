package com.api.entity;

import javax.persistence.Entity;




@Entity
public class Student {
	
	
	private Long Id;
	private String first_Name;
	private String lastName;
	public Student(Long id, String first_Name, String lastName) {
		super();
		Id = id;
		this.first_Name = first_Name;
		this.lastName = lastName;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
