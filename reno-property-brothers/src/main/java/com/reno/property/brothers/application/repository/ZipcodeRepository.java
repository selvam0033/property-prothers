package com.reno.property.brothers.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reno.property.brothers.application.domain.database.Zipcode;

public interface ZipcodeRepository extends JpaRepository<Zipcode, Integer> {
	List<Zipcode> findAll();
}
