package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo4Application {
	
	@GetMapping
	public String helloWorld()
	{
		return "Helloooo0000000 World";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo4Application.class, args);
	}

}
