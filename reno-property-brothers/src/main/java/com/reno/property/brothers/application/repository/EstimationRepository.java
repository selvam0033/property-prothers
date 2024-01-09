package com.reno.property.brothers.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reno.property.brothers.application.domain.database.Estimation;

public interface EstimationRepository extends JpaRepository<Estimation, Integer>{
	@Query(value="select estimation0_.estimate_Unique_Id from estimation estimation0_ order by estimation0_.estimate_Unique_Id  DESC LIMIT 1 ", nativeQuery = true)
	int findTopByOrderById();
	
	@SuppressWarnings("unchecked")
	Estimation save(Estimation estimation);
}
