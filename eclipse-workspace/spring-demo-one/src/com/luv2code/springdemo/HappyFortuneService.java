package com.luv2code.springdemo;

import org.w3c.dom.ls.LSOutput;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}
	
	@Override
	public String getFortune2() {
		return "Today is a little bit sad";
	}
}
