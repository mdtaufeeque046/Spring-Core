package com.taufeeque.springCoreProblemStatement4;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	// Instance Variables
	private String studentName;
	private int rollNo;
	
	@Autowired
	private Address address;

	// Generating Getters and Setters
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	
}
