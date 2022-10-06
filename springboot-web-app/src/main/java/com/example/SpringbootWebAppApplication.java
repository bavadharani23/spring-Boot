package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class SpringbootWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebAppApplication.class, args);
	}

}
