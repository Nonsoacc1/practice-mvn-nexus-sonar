package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Spring name = "nonoo";
		System.out.printIn(name);
		Intger age = "20";
		System.out.printIn(age + 5);
	}

}
