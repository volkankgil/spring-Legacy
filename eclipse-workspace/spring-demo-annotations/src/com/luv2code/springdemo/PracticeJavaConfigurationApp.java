package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PracticeJavaConfigurationApp {
	
	public static void main(String[] args) {
	

	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);	
	
	PingPongCoach theCoach=context.getBean("pingPongCoach",PingPongCoach.class);

	System.out.println(theCoach.getDailyWorkout());
	
	System.out.println(theCoach.getDailyFortune());
	
	}	
}

