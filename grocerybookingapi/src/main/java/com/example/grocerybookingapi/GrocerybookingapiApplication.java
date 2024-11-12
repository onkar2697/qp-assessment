package com.example.grocerybookingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GrocerybookingapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrocerybookingapiApplication.class, args);
	}

}
