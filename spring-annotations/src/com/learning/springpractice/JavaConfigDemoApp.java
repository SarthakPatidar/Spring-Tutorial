package com.learning.springpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);

		Coach alphaCoach = context.getBean("Football", Coach.class);

		// call a method on theCoach bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());

		// call a method on aplhaCoach bean
		System.out.println(alphaCoach.getDailyWorkout());
		System.out.println(alphaCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
