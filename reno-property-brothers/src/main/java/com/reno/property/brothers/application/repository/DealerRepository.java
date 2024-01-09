package com.reno.property.brothers.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reno.property.brothers.application.domain.database.Dealer;

public interface DealerRepository extends JpaRepository<Dealer, Integer> {	
	
	@Query("SELECT g FROM Dealer g where g.product = ?1 AND g.dealerName = ?2")
	List<Dealer> findByProductGrade(String product,String dealerName);
	
	@Query(value="select dealer_.dealer_Unique_Id from Dealer dealer_ order by dealer_.dealer_Unique_Id  DESC LIMIT 1 ", nativeQuery = true)
	int findTopByOrderById();
	
	
	List<Dealer> findByProduct(String product);
	
	@SuppressWarnings("unchecked")
	Dealer save(Dealer dealer);

}
