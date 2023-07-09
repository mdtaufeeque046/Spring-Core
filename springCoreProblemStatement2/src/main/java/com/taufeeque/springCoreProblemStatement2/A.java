package com.taufeeque.springCoreProblemStatement2;

public class A {
	// Private instance Variable obj of type B.
	private B obj;
	
	public void printMessage() {
		String msg = obj.getMessage();
		System.out.println(msg);
		
	}

	// Creating Getters and Setters of our Instance Variable.
	public B getObj() {
		return obj;
	}

	public void setObj(B obj) {
		this.obj = obj;
	}
	
	

}
