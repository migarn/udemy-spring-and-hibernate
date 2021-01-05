package com.luv2code.springboot.demo.mycoolapp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Mycoolapp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mycoolapp2Application.class, args);
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day.";
	}

}
