package com.taufeeque.springCoreProblemStatement7;

public class Mobile {

	// Instance variables
	private String mobileName;
	private String mobileType;
	private String mobileBrand;
	private double mobilePrice;
	private int mobileStorageCapacity;

	// Constuctor
	public Mobile(String mobileName, String mobileType, String mobileBrand, double mobilePrice,
			int mobileStorageCapacity) {
		super();
		this.mobileName = mobileName;
		this.mobileType = mobileType;
		this.mobileBrand = mobileBrand;
		this.mobilePrice = mobilePrice;
		this.mobileStorageCapacity = mobileStorageCapacity;
	}

	// Generating Setters and Getters

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileType() {
		return mobileType;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public double getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	public int getMobileStorageCapacity() {
		return mobileStorageCapacity;
	}

	public void setMobileStorageCapacity(int mobileStorageCapacity) {
		this.mobileStorageCapacity = mobileStorageCapacity;
	}

}
