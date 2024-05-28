package com.companyname.springbootcrudrest.exception;

//importing required interfaces and classes
import java.util.Date;

//Class to represent details of an error response
public class ErrorDetails {
	
	// Fields to store timestamp, error message, and error details
	private Date timestamp; // Timestamp when the error occurred
	private String message;// Error message
	private String details;// Additional details about the error

	 // Constructor to create an ErrorDetails object with provided timestamp, message, and details
	public ErrorDetails(Date timestamp, String message, String details) {
		super();// Call the constructor of the superclass (Object)
		this.timestamp = timestamp;// Set the timestamp
		this.message = message;// Set the error message
		this.details = details; // Set the error details
	}

	 // Getter method to retrieve the timestamp
	public Date getTimestamp() {
		return timestamp;
	}

	// Getter method to retrieve the error message
	public String getMessage() {
		return message;
	}

	// Getter method to retrieve the error details
	public String getDetails() {
		return details;
	}
}
