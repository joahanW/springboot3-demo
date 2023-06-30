package com.demo.springboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
		scanBasePackages = {
				"com.demo.springboot3",
				"com.demo.util"
		}
)
*/
@SpringBootApplication
public class Springboot3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3Application.class, args);
		System.out.println("\n  Server app is running ... \n ");
	}

}
