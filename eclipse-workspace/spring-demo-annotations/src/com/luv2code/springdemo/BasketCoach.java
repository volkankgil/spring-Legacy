	package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

    @Component
    public class BasketCoach implements Coach {
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService; 	//field injection 
	
	
	//define a default constructor
	
	/*public BasketCoach() {
		System.out.println(">>inside default constructor");
	}*/

	@Override
	public String getDailyWorkout() {
		return "at least throw 100 ball everyday.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	/*
	//define a setter method
	@Autowired
	public void setfortuneService(FortuneService fortuneService) { //In method injection method name is not important, we can write volkanfortuneservice instead of setfortuneService
		this.fortuneService=fortuneService;
	}
*/
	}

