package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String[] args) {
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Coach theCoach =context.getBean("thatSillyCoach",Coach.class);
	
	Coach aplhaCoach=context.getBean("thatSillyCoach",Coach.class);
	
	boolean result=(theCoach==aplhaCoach);
	
	if(result) {
		System.out.println("Pointing at same object");
	}else {
		System.out.println("Pointing at different object");
	}
	
	System.out.println("Memory location for the Coach:" + theCoach);
	
	System.out.println("Memory location for the Coach:" + aplhaCoach);
	
	// default scope always singleton = pointing at same object , prototype scope create new instance everytime
	
	context.close();
	
	}

}
