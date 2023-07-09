package com.taufeeque.springCoreProblemStatement13;

public class CoffeeShop {
	private String branchAddress;

	   public CoffeeShop(String branchAddress) {
	      this.branchAddress = branchAddress;
	   }

	   public void serveCoffee() {
	      System.out.println("Serving coffee at: " + branchAddress);
	   }

}
