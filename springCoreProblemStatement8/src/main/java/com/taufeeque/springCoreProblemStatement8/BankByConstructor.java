package com.taufeeque.springCoreProblemStatement8;

import org.springframework.beans.factory.annotation.Autowired;

public class BankByConstructor {

	// Instance Variables
	private String bankName;
	private Address address;

	// Constructor using Fields
	@Autowired
	public BankByConstructor(String bankName, Address address) {
		super();
		this.bankName = bankName;
		this.address = address;
	}

	// Generating Getters and Setters
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
