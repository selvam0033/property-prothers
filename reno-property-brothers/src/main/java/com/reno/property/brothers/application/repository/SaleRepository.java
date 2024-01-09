package com.reno.property.brothers.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reno.property.brothers.application.domain.database.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer> {
	
	@Query(value="select Sale.sale_Uniqe_Id from Sale Sale order by Sale.sale_Uniqe_Id  DESC LIMIT 1 ", nativeQuery = true)
	int findTopByOrderById();	
	
	@Query(value="select * from Sale Sale where Sale.SALEID=?", nativeQuery = true)
	Sale findBySaleid(String saleid);
	
	@SuppressWarnings("unchecked")
	Sale save(Sale sale);
}
