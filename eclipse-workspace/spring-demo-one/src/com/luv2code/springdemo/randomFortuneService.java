package com.luv2code.springdemo;

import java.util.Random;

import javax.print.DocFlavor.INPUT_STREAM;

public class randomFortuneService implements FortuneService {
	
	//create an array of strings
	private String data[]= {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	//create a random number generator 
	
	private Random randomNumber=new Random();

	@Override
	public String getFortune() {
		//pick a random String from the array
		
		int index=randomNumber.nextInt(data.length);
		
		String thefortune = data[index];
		
		return thefortune;
	}

	@Override
	public String getFortune2() {
		return null;
	}

}
