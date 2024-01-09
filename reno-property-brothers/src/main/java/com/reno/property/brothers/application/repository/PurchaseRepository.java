package com.reno.property.brothers.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reno.property.brothers.application.domain.database.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer>{
	@Query(value="select purchase_.purchase_Uniqe_Id from Purchase purchase_ order by purchase_.purchase_Uniqe_Id  DESC LIMIT 1 ", nativeQuery = true)
	int findTopByOrderById();
	
	@SuppressWarnings("unchecked")
	Purchase save(Purchase sale);
}
