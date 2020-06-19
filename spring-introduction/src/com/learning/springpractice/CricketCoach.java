package com.learning.springpractice;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "improve balling speed";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void startUp() {
		System.out.println("CricketCoach: inside method startUp");
	}

	public void cleanUp() {
		System.out.println("CricketCoach: inside method cleanUp");
	}
}
