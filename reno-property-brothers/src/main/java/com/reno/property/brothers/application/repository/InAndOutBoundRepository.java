package com.reno.property.brothers.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reno.property.brothers.application.domain.database.Bound;

public interface InAndOutBoundRepository extends JpaRepository<Bound, Integer> {
	List<Bound> findAll();
}
