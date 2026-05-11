package com.jenkinsDockerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDockerServiceApplication {
	
private static Logger logger = LoggerFactory.getLogger(JenkinsDockerServiceApplication.class);
    
	@PostConstruct
	public void init(){
	logger.info("Application Started...");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerServiceApplication.class, args);
	}

}
