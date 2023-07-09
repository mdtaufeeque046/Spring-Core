package com.taufeeque.springCoreProblemStatement5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean
	public Student student() {
		Student st = new Student();
		st.setStudentId(31);
		st.setStudentName("Md Taufeeque Alam");
		st.setAge(22);
		st.setSchoolName("St. Xavier");
		
		return st;
		
	}

}
