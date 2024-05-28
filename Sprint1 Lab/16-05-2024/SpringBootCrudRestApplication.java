package com.companyname.springbootcrudrest;//package name

// importing required interfaces and classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//Annotation to declare this class as the main Spring Boot application class
@SpringBootApplication
//Annotation to enable JPA Auditing for entity auditing functionality
@EnableJpaAuditing
public class SpringBootCrudRestApplication {

	 // Main method to start the Spring Boot application
	public static void main(String[] args) {
		// SpringApplication.run() method starts the Spring Boot application
        // It takes two arguments:
        // 1. The main class of the application (current class in this case)
        // 2. Command-line arguments (args) passed to the application
		SpringApplication.run(SpringBootCrudRestApplication.class, args);
	}
}
