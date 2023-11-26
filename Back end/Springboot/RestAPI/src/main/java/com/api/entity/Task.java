package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity	
public class Task {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Long Id;
	
	private String name;
	private String assignTo;
	public Task() {
		
	}
	
	public Task(Long id, String name, String assignTo) {
		super();
		Id = id;
      	this.name = name;
		this.assignTo = assignTo;
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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