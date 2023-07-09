package com.taufeeque.springCoreProblemStatement7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean
	public Mobile mobile() {
		return new Mobile("Galaxy F54", "Android", "Samsung", 350000, 256);
		
	}

}
