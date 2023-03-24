package com.luv2code.springdemo;


public class MarinFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Marin yanındayken şansa ihtiyacın yok";
	}
	
}
