package com.taufeeque.springCoreProblemStatement7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext();
        context.register(MyConfig.class);
        context.refresh();
        
        Mobile mb = context.getBean(Mobile.class);
        
        System.out.println("Mobile Name : "+mb.getMobileName());
        System.out.println("Mobile Type : "+mb.getMobileType());
        System.out.println("Mobile Brand Name :"+mb.getMobileBrand());
        System.out.println("Mobile Price : "+mb.getMobilePrice());
        System.out.println("Mobile Storage Capacity : "+mb.getMobileStorageCapacity());
        
        context.close();
        
    }
}
