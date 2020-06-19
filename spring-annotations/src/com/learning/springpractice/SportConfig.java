package com.learning.springpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.learning.springpractice")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(happyFortuneService());
	}
}
