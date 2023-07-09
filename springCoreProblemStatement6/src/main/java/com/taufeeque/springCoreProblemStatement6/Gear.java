package com.taufeeque.springCoreProblemStatement6;

// This is Gear Class that represents the gears of the car.
public class Gear {

	// Gear class Implementation
	private int gearNumber;
	private boolean isGearEngaged;
	private boolean isReverse;
	private boolean isGearLocked;
	private double gearSpeed;

	// Generating Setters and Getters
	public int getGearNumber() {
		return gearNumber;
	}

	public void setGearNumber(int gearNumber) {
		this.gearNumber = gearNumber;
	}

	public boolean isGearEngaged() {
		return isGearEngaged;
	}

	public void setGearEngaged(boolean isGearEngaged) {
		this.isGearEngaged = isGearEngaged;
	}

	public boolean isReverse() {
		return isReverse;
	}

	public void setReverse(boolean isReverse) {
		this.isReverse = isReverse;
	}

	public boolean isGearLocked() {
		return isGearLocked;
	}

	public void setGearLocked(boolean isGearLocked) {
		this.isGearLocked = isGearLocked;
	}

	public double getGearSpeed() {
		return gearSpeed;
	}

	public void setGearSpeed(double gearSpeed) {
		this.gearSpeed = gearSpeed;
	}

}
