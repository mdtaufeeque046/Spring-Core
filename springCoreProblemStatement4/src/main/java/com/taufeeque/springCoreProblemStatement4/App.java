package com.taufeeque.springCoreProblemStatement4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      
    	ClassPathXmlApplicationContext context = 
    			new ClassPathXmlApplicationContext("spring-test.xml");
    	
    	Student st = (Student) context.getBean("student");
    	
    	System.out.println("Student Name : "+st.getStudentName());
    	System.out.println("Student Roll number : "+st.getRollNo());
    	System.out.println("Street : "+st.getAddress().getStreet());
    	System.out.println("City : "+st.getAddress().getCity());
    	System.out.println("State : "+st.getAddress().getState());
    	
    	context.close();
    }
}
