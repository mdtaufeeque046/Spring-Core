package com.taufeeque.springCoreProblemStatement6;

// This is Engine class that represents the engine of the car.
public class Engine {

	// Engine Class Implementation
	private String engineManufacturer;
	private String fuelType;
	private double fuelConsumptionRate;
	private boolean isEngineRunning;
	private boolean isEngineOverHeating;

	// Generating Setters and Getters
	public String getEngineManufacturer() {
		return engineManufacturer;
	}

	public void setEngineManufacturer(String engineManufacturer) {
		this.engineManufacturer = engineManufacturer;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getFuelConsumptionRate() {
		return fuelConsumptionRate;
	}

	public void setFuelConsumptionRate(double fuelConsumptionRate) {
		this.fuelConsumptionRate = fuelConsumptionRate;
	}

	public boolean isEngineRunning() {
		return isEngineRunning;
	}

	public void setEngineRunning(boolean isEngineRunning) {
		this.isEngineRunning = isEngineRunning;
	}

	public boolean isEngineOverHeating() {
		return isEngineOverHeating;
	}

	public void setEngineOverHeating(boolean isEngineOverHeating) {
		this.isEngineOverHeating = isEngineOverHeating;
	}

}
