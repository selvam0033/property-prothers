package com.reno.property.brothers.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reno.property.brothers.application.domain.database.Productregistration;

public interface ProductRegistrationRepositroy extends JpaRepository<Productregistration, Integer> {
	
	
	@Query("SELECT g FROM Productregistration g where g.product = ?1 AND g.dealerName = ?2 AND g.grade = ?3")
	Productregistration findByProductGradePrice(String product,String dealerName,String grade);
	
	@Query(value="select g.prod_Reg_Unique_Id from Productregistration g order by g.prod_Reg_Unique_Id  DESC LIMIT 1 ", nativeQuery = true)
	int findTopByOrderById();
	
	@SuppressWarnings("unchecked")
	Productregistration save(Productregistration productregistration);
	

}
