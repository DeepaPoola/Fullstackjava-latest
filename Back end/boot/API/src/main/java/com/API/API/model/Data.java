package com.API.API.model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Data {

	@Id
	private Long id;
	private String firstName;
	public Data(Long id, String firstName) {
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
