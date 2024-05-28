package com.companyname.springbootcrudrest.controller; // Package name for the User class

//Importing required interfaces and classes
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.companyname.springbootcrudrest.exception.ResourceNotFoundException;
import com.companyname.springbootcrudrest.model.User;
import com.companyname.springbootcrudrest.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;// Autowired repository for User entities


    // Get all users
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();// Retrieve all users from the repository
	}

	// Get user by ID
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(
			@PathVariable(value = "id") Long userId) throws ResourceNotFoundException {
		User user = userRepository.findById(userId)// Find user by ID in the repository
        .orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId)); // Throw exception if user not found
		return ResponseEntity.ok().body(user);// Return user with HTTP status 200 OK
	}

	// Create a new user
	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User user) {
		return userRepository.save(user);// Save the new user to the repository
	}

	// Update an existing user
	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(
			@PathVariable(value = "id") Long userId,
			@Valid @RequestBody User userDetails) throws ResourceNotFoundException {
		User user = userRepository.findById(userId)// Find user by ID in the repository
		        .orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId)); // Throw exception if user not found
		
		// Update user details
		user.setEmailId(userDetails.getEmailId());
		user.setLastName(userDetails.getLastName());
		user.setFirstName(userDetails.getFirstName());
		user.setUpdatedAt(new Date());
		
		final User updatedUser = userRepository.save(user);// Save the updated user to the repository
		return ResponseEntity.ok(updatedUser); // Return updated user with HTTP status 200 OK
	}

	  // Delete an existing user
	@DeleteMapping("/users/{id}")
	public Map<String, Boolean> deleteUser(
			@PathVariable(value = "id") Long userId) throws ResourceNotFoundException {
		User user = userRepository.findById(userId) // Find user by ID in the repository
		        .orElseThrow(() -> new ResourceNotFoundException("User not found :: " + userId));// Throw exception if user not found

		userRepository.delete(user);// Delete the user from the repository
		
		 // Create response with deletion status
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;// Return deletion status
	}
}
