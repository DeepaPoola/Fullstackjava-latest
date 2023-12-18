package com.api.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String first_Name;
    private String lastName;
	public Student(Long id, String first_Name, String lastName) {
		super();
		this.id = id;
		this.first_Name = first_Name;
		this.lastName = lastName;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
