package com.learning.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		BaseballCoach baseBallCoach = context.getBean("myBaseballCoach", BaseballCoach.class);

		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(baseBallCoach.getDailyWorkout());

		// new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		System.out.println(baseBallCoach.getDailyFortune());

		// methods on string literals
		System.out.println(baseBallCoach.getEmailAddress());
		System.out.println(baseBallCoach.getTeam());

		// close the context
		context.close();

	}

}
