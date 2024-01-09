package com.reno.property.brothers.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reno.property.brothers.application.domain.database.Categorytype;

public interface CategoryTypeRepository extends JpaRepository<Categorytype, Integer>{
	List<Categorytype> findAll();
}
