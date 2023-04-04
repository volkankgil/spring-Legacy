package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
				
				// load the spring configurition file
		
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//retrrieve bean from spring container
				
				CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class); //Coach yerine cricketcoach'dan oluşturduk çünkü coach team ve e-mail get metoduna sahip değil
				
				//call methods on the bean 
				
				System.out.println(theCoach.getDailyWorkOut());
				System.out.println(theCoach.getDailyFortune());
				
				//call our methods to get the literal values
				
				System.out.println(theCoach.getEmailAdress());
				System.out.println(theCoach.getTeam());
				
				// close the context
				
				context.close();


	}

}
