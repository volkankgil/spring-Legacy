package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


	@Component("thatSillyCoach")  //if we do not write component name , java assign default component name automaticly.(tennisCoach) name is same class name but first letter start with little.
	public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//@Autowired --configure dependency injection on constructor with @Autowired Annotation
	public TennisCoach() {
		System.out.println("inside tennisCoach");
	}
	
	//define my init method
	
	@PostConstruct
	public void initmethod() {
		System.out.println(">>tennis coach:inside init method");
	}
	
	//define my destroy method
	
	@PreDestroy
	public void destroymethod() {
		System.out.println(">>tennis coach:inside destroy method");
	}
	@Override
	public String getDailyWorkout() { 
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
