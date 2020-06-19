package com.learning.springpractice;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	private String emailAddress;
	private String team;

	public BaseballCoach() {
		System.out.println("Inside no-arg constructor of BaseballCoach");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setter of emailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside setter of team");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter of fortuneService");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
