package com.taufeeque.springCoreProblemStatement3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext("spring-test.xml");
        
        Employee emp = (Employee)context.getBean("employee");
        
        System.out.println("Employee Id : "+emp.getEmpId());
        System.out.println("Employee Name : "+emp.getEmpName());
        System.out.println("Employee age : "+emp.getAge());
        System.out.println("Employee Salary : "+emp.getSalary());
        
        context.close();
        
    }
}
