package com.api.model;

import jakarta.persistence.Entity;

@Entity
public class Employee {
   
	private Long id;
	private String firstName;
	public Employee(Long id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
