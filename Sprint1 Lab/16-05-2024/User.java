package com.companyname.springbootcrudrest.model;// Package name for the User class

//importing required interfaces and classes
import java.util.Date;

import jakarta.persistence.*;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

//Entity annotation to mark this class as a JPA entity
@Entity
//Table annotation to specify the table name for this entity
@Table(name = "users")
//EntityListeners annotation to specify the AuditingEntityListener for auditing support
@EntityListeners(AuditingEntityListener.class)
public class User {

	// Fields representing columns in the 'users' table
	private long id;// User ID
	private String firstName;// User's first name
	private String lastName;// User's last name
	private String emailId;// User's email address
	private Date createdAt;// Timestamp for when the user was created
	private String createdBy;// User who created the user
	private Date updatedAt;// Timestamp for when the user was last updated
	private String updatedby;// User who last updated the user
	
	// Getter and setter methods for the fields

    // Getter method for the user ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
    
    // Setter method for the user ID
	public void setId(long id) {
		this.id = id;
	}
	
	// Getter and setter methods for the first name
    @Column(name = "first_name", nullable = false)	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// Getter and setter methods for the last name
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	 // Getter and setter methods for the created timestamp
	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	 // Getter and setter methods for the created timestamp
	@Column(name = "created_at", nullable = false)
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	 // Getter and setter methods for the created timestamp
	@Column(name = "created_by", nullable = false)
	@CreatedBy
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	 // Getter and setter methods for the created by user
	@Column(name = "updated_at", nullable = false)
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	// Getter and setter methods for the updated by user
	@Column(name = "updated_by", nullable = false)
	@LastModifiedBy
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
}
