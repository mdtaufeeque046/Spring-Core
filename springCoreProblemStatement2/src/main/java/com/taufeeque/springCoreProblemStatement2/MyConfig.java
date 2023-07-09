package com.taufeeque.springCoreProblemStatement2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// It is a configuration Class annotated with @Configuration, indicating that it provides bean definition.
@Configuration
public class MyConfig {
	
	@Bean
	public A createBean() {
		A objA = new A();
		objA.setObj(createB());
		return objA;
		
	}
	
	//Creating Another Bean method
	@Bean
	public B createB() {
		return new B();
		
	}

}
