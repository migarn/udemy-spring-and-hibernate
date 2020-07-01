package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("myFootballCoach")
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Kick!";
	}

}
