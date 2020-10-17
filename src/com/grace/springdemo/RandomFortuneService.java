package com.grace.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] fortuneArr = new String[] {"Happy Happy Day!", "Nothing to complain!", "What's a day!"};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(fortuneArr.length);
		
		return fortuneArr[(int) Math.floor(Math.random()*fortuneArr.length)];
	}

}
