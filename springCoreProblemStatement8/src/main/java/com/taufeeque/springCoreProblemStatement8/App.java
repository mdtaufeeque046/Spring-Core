package com.taufeeque.springCoreProblemStatement8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-test.xml");

		System.out.println("----Banks Name and Their Addresses----");

		System.out.println("============Autowire ByName================");

		BankByName bankByName = (BankByName) context.getBean("bankByName");
		System.out.println("Employer Name : " + bankByName.getBankName());
		System.out.println("City : " + bankByName.getAddress().getCity());
		System.out.println("State : " + bankByName.getAddress().getState());

		System.out.println("=============Autowire ByType");

		BankByType bankbyType = (BankByType) context.getBean("bankByType");
		System.out.println("Employer Name : " + bankbyType.getBankName());
		System.out.println("City :" + bankbyType.getAddress().getCity());
		System.out.println("State : " + bankbyType.getAddress().getState());

		System.out.println("=============Autowire ByConstructor==========");

		BankByConstructor bankByConstructor = (BankByConstructor) context.getBean("bankByConstructor");
		System.out.println("Employer Name : " + bankByConstructor.getBankName());
		System.out.println("City : " + bankByConstructor.getAddress().getCity());
		System.out.println("State : " + bankByConstructor.getAddress().getState());

		context.close();

	}
}
