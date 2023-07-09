package com.taufeeque.springCoreProblemStatement6;

// Car class will encapsulate the behavior and properties of a car.
public class Car {
	
	// Instance Variable;
	private String carName;
	
	// Car class Implementation
	// The Car class will have the dependencies on the Engine, Brakes, and Gear Classes.
	// This means that Car class needs instance of these classes to perform its operations.
	private Engine engine;
	private Brakes brakes;
	private Gear gear;
	
	// Constructor
	public Car(String carName, Engine engine, Brakes brakes, Gear gear) {
		super();
		this.carName = carName;
		this.engine = engine;
		this.brakes = brakes;
		this.gear = gear;
	}

	// Generating Setters and Getters

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Brakes getBrakes() {
		return brakes;
	}

	public void setBrakes(Brakes brakes) {
		this.brakes = brakes;
	}

	public Gear getGear() {
		return gear;
	}

	public void setGear(Gear gear) {
		this.gear = gear;
	}
	

	
	
	
	
	

}
