package com.reno.property.brothers.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reno.property.brothers.application.domain.database.FillUpSandOnBasement;

public interface FillUpSandOnBasementRepository extends JpaRepository<FillUpSandOnBasement, Integer> {

	@SuppressWarnings("unchecked")
	FillUpSandOnBasement save(FillUpSandOnBasement fillUpSandOnBasement);
}
