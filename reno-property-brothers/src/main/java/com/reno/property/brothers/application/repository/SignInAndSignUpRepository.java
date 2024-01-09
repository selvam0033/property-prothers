package com.reno.property.brothers.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reno.property.brothers.application.domain.database.User;

public interface SignInAndSignUpRepository extends JpaRepository<User, Integer> {
	
	User findByUserName(String userName);

}
