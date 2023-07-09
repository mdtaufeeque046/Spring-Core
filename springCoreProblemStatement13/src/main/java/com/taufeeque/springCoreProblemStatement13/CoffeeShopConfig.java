package com.taufeeque.springCoreProblemStatement13;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoffeeShopConfig {

	@Bean
	@Qualifier("hyderabadAddress")
	public String hyderabadAddress() {
		return " Ammerpet, Hyderabad, India";
	}

	@Bean
	@Qualifier("secunderabadAddress")
	public String secunderabadAddress() {
		return "S.R. Nagar, Secunderabad, India";
	}

}
