package com.luv2code.springdemo;

import org.springframework.stereotype.Component;


public class PingPongCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public PingPongCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
