package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileFortuneService implements FortuneService {
	
	private List<String> fortunes;
	
	@Override
	public String getFortune() {
		
		try {
			FileReader fileReader = new FileReader("fortunes.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			this.fortunes = new ArrayList<>();
			String line = null;
			
			while ((line = bufferedReader.readLine()) != null) {
				fortunes.add(line);
				
				bufferedReader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Random random = new Random();
		
		int index = random.nextInt(fortunes.size());
		String theFortune = fortunes.get(index);
		return theFortune;
	}
}
