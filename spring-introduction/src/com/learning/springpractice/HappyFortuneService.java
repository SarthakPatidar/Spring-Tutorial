package com.learning.springpractice;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortunes = {"Lucky", "Not Lucky", "Ideal"};

	@Override
	public String getFortune() {
		int randomIndex = new Random().nextInt(fortunes.length);
		return fortunes[randomIndex];
	}

}
