package com.reno.property.brothers.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reno.property.brothers.application.domain.database.Workcategory;

public interface WorkCategoryRepository extends JpaRepository<Workcategory, Integer>{
	
	List<Workcategory> findAll();
	

}
