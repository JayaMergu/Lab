package com.companyname.springbootcrudrest.exception;// package name

//importing reqquired interfaces and classes
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

//Annotation to indicate that this class provides global exception handling for controllers
@ControllerAdvice
public class GlobalExceptionHandler {
	
	// Exception handler for ResourceNotFoundException
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
		// Create an ErrorDetails object with timestamp, exception message, and request description
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		// Return ResponseEntity with ErrorDetails and HTTP status code 404 NOT FOUND
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

	// Exception handler for all other exceptions
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
		// Create an ErrorDetails object with timestamp, exception message, and request description
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		// Return ResponseEntity with ErrorDetails and HTTP status code 500 INTERNAL SERVER ERROR
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
