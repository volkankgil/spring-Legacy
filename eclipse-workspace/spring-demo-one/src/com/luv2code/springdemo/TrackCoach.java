package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It :" + fortuneService.getFortune2();
	}
	
	//add an init method
	
	public void initMethod() {
		System.out.println("TrackCoach:inside method initMethod");
	}
	
	public void destroyedMethod() {
		System.out.println("TrackCoach:inside method destroyedMethod");
	}
}
