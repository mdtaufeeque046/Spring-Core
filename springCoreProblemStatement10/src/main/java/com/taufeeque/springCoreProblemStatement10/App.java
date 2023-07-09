package com.taufeeque.springCoreProblemStatement10;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("movie.xml");
         Movie movie = (Movie)context.getBean("movie");
         
       // movie.play();
         
         
        //-----------------OR----------------
        
         System.out.println("Movie name is:"+movie.getMovieName());
         System.out.println("Movie director is:"+movie.getDirector());
          
    }
}
