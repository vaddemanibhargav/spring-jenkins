package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JenkinsSampleApplication {
	
	public static void main(String[] args) {
		System.out.println("Hello Things");
		SpringApplication.run(JenkinsSampleApplication.class, args);
	}

}
