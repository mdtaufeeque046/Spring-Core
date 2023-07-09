package com.taufeeque.springCoreProblemStatement5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext(MyConfig.class);
    	
    	Student st =  context.getBean(Student.class);
    	
    	System.out.println("Student Id :"+st.getStudentId());
    	System.out.println("Student Name : "+st.getStudentName());
    	System.out.println("Student Age : "+st.getAge());
    	System.out.println("School Name :"+st.getSchoolName());
    	
    	context.close();
    
    }
}
