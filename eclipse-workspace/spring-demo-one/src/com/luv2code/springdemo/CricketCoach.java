package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAdress;
	private String team;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling in 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//our setter method
	public void setfortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
		System.out.println("setter injection in here ");
	}
	
	
	public String getEmailAdress() {
		return emailAdress;
	}

	public String getTeam() {
		return team;
	}
	
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
		System.out.println("CricketCoach: inside setter method - setemailadress");
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("CricketCoach: inside setter method - setTeam");
	}
}
