package com.cognizant.hey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.cognizant")
public class HeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeyApplication.class, args);
	}

}
