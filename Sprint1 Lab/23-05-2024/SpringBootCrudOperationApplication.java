package com.javatpoint;

// Specifies the package name, which helps in organizing classes and avoiding name conflicts.

import org.springframework.boot.SpringApplication;
// Imports the SpringApplication class from the Spring Boot framework, which is used to bootstrap the application.

import org.springframework.boot.autoconfigure.SpringBootApplication;
// Imports the SpringBootApplication annotation, which is a convenience annotation that adds all of the following:
// @Configuration: Tags the class as a source of bean definitions for the application context.
// @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
// @ComponentScan: Tells Spring to look for other components, configurations, and services in the specified package.

@SpringBootApplication
// Marks this class as a Spring Boot application. This annotation is used to enable auto-configuration and component scanning in the application.

public class SpringBootCrudOperationApplication {
    // Declares a public class named SpringBootCrudOperationApplication which will serve as the entry point for the Spring Boot application.

    public static void main(String[] args) {
        // Defines the main method, which is the entry point of any Java application. This is where the program starts executing.

        SpringApplication.run(SpringBootCrudOperationApplication.class, args);
        // Calls the run method of the SpringApplication class, passing the current class and command-line arguments to it.
        // This method launches the Spring Boot application by creating an ApplicationContext and initializing Spring Beans.
    }
}
