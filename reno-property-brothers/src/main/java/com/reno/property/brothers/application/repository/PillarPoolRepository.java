package com.reno.property.brothers.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reno.property.brothers.application.domain.database.PillarPool;

public interface PillarPoolRepository extends JpaRepository<PillarPool, Integer> {
	@SuppressWarnings("unchecked")
	PillarPool save(PillarPool pillarPool);
}
