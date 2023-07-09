package com.taufeeque.springCoreProblemStatement8;

import org.springframework.beans.factory.annotation.Autowired;

public class BankByName {
	// Instance Variables
	private String bankName;

	@Autowired
	private Address address;

	// Generating Setters and Getters
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
