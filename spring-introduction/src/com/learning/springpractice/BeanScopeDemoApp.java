package com.learning.springpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if the results are the same
		boolean result = (theCoach == alphaCoach);

		// print results
		System.out.println("\nPointing to the same object: " + result);

		System.out.println("\nMemory location of theCoach: " + theCoach);

		System.out.println("\nMemory location of alphaCoach: " + alphaCoach + "\n");

		// close the context
		context.close();

	}

}
