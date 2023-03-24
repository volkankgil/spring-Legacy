package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String teamString;
	

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {
	
		return "Swim one 100 metres as a warm up";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeamString() {
		return teamString;
	}

}
