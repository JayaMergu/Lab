package com.companyname.springbootcrudrest.exception; // package name

//importing required interfaces and classes
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Annotation to specify the HTTP status code to be returned in case of this exception
@ResponseStatus(value = HttpStatus.NOT_FOUND)// 404 NOT FOUND status
public class ResourceNotFoundException extends Exception{
	
	// Serial version UID for serialization and deserialization
	private static final long serialVersionUID = 1L;

	// Constructor to create a new instance of ResourceNotFoundException with a custom message
	public ResourceNotFoundException(String message){
		// Call the constructor of the parent class (Exception) with the provided message
    	super(message);
    }
}
