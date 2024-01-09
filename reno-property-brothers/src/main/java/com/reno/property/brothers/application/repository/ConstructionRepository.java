package com.reno.property.brothers.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reno.property.brothers.application.domain.database.Construction;

public interface ConstructionRepository extends JpaRepository<Construction, Integer> {
	List<Construction> findAll();
}
