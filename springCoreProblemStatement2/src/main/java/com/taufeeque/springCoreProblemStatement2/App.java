package com.taufeeque.springCoreProblemStatement2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext(MyConfig.class);
    	//context.register(MyConfig.class);
    	
    	A objA = context.getBean(A.class);
    	objA.printMessage();
    	
    	context.close();
    	
    }
}
