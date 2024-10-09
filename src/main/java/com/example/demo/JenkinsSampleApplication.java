package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsSampleApplication {
	public static org.slf4j.Logger logger=LoggerFactory.getLogger(JenkinsSampleApplication.class);
	@PostConstruct
	public void init() {
		logger.info("aplication started...");
	}
	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(JenkinsSampleApplication.class, args);
	}

}
