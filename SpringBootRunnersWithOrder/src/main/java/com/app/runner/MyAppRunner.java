package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
@Component
public class MyAppRunner implements CommandLineRunner,Ordered {
	public int getOrder() {
		// TODO Auto-generated method stub
		return 5;
	}
	public void run(String... args) throws Exception {
		System.out.println("From Runner A");
		
	}

	

}
