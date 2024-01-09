package com.reno.property.brothers.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reno.property.brothers.application.domain.database.EmployeeAssociation;

public interface EmployeeAssociationRepository extends JpaRepository<EmployeeAssociation, Integer> {
	
	@SuppressWarnings("unchecked")
	EmployeeAssociation save(EmployeeAssociation employeeAssociation);

}
