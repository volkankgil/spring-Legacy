package com.luv2code.springdemo;

import java.io.Closeable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-ApplicationContext.xml");
		
		//retrieve bean from spring container 
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are the same
		
		boolean result =(theCoach==alphaCoach);
		
		//print out the results
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach : " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach : " + alphaCoach);
		
		//close the context
		context.close();

	}

}
