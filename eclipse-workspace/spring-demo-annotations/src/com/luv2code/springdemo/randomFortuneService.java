package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class randomFortuneService implements FortuneService {
	
	//create an array of strings
	
	private String[] data= {
			"Beware of the wolf in sheep's clothing",
			"volkan marinin babası olduğu için çok şanslı",
			"the journey is reward"
	};
	
	Random randomNumber=new Random();
	
	@Override
	public String getFortune() {
		int index=randomNumber.nextInt(data.length);
		return data[index];
	}

}
