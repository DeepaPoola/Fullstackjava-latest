package com.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Passenger.findbyFirstName", query = "select p from Passenger p where p.firstName=?1")

public class Passenger {
	
 @Id
 private Integer passengerId;
 @Column(length=15)
 private String firstName;
 
 @Column(length=15)
 private String lastName;
 
 @Column(length=15)
 private String emailId;
 
 @Column(length=15)
 private Integer seatno;
 
 public Integer getPassengerId() {
	return passengerId;
}

public void setPassengerId(Integer passengerId) {
	this.passengerId = passengerId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public Integer getSeatno() {
	return seatno;
}

public void setSeatno(Integer seatno) {
	this.seatno = seatno;
}


}
