package com.luv2code.springdemo;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = {"First fortune", "Second fortune", "Third fortune"};
		int random = ThreadLocalRandom.current().nextInt(0, fortunes.length);
		return fortunes[random];
	}

}
