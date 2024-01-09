package com.reno.property.brothers.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reno.property.brothers.application.domain.database.District;

public interface DistrictRepository extends JpaRepository<District, Integer>{
	List<District> findAll();

}
