package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String name;
	private String assignTo;
	
	public Task(Long id, String name, String assignTo) {
		super();
		this.id = id;
		this.name = name;
		this.assignTo = assignTo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAssignTo() {
		return assignTo;
	}
	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
	}
	
	
}
