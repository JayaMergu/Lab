package com.companyname.springbootcrudrest.repository;// Package name for the User class

//importing required interfaces and classes
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companyname.springbootcrudrest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}