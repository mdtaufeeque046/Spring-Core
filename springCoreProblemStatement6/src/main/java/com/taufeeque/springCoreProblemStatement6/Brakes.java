package com.taufeeque.springCoreProblemStatement6;

// This is Brakes class that represents the brakes of the car.
public class Brakes {

	// Brakes class implementation
	private boolean isBrakeEngaged;
	private double brakeFluidLevel;
	private boolean isParkingBrakeOn;
	private boolean isParkingBrakeLightsOn;

	// Generating Setters and Getters
	public boolean isBrakeEngaged() {
		return isBrakeEngaged;
	}

	public void setBrakeEngaged(boolean isBrakeEngaged) {
		this.isBrakeEngaged = isBrakeEngaged;
	}

	public double getBrakeFluidLevel() {
		return brakeFluidLevel;
	}

	public void setBrakeFluidLevel(double brakeFluidLevel) {
		this.brakeFluidLevel = brakeFluidLevel;
	}

	public boolean isParkingBrakeOn() {
		return isParkingBrakeOn;
	}

	public void setParkingBrakeOn(boolean isParkingBrakeOn) {
		this.isParkingBrakeOn = isParkingBrakeOn;
	}

	public boolean isParkingBrakeLightsOn() {
		return isParkingBrakeLightsOn;
	}

	public void setParkingBrakeLightsOn(boolean isParkingBrakeLightsOn) {
		this.isParkingBrakeLightsOn = isParkingBrakeLightsOn;
	}

}
