package com.reno.property.brothers.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reno.property.brothers.application.domain.database.Site;

public interface SiteRepository extends JpaRepository<Site, Integer> {
	
	List<Site> findAll();
	
	@Query(value="select s.SITE_UNIQUE_ID from Site s order by s.SITE_UNIQUE_ID  DESC LIMIT 1 ", nativeQuery = true)
	int findTopByOrderById();
	
	@SuppressWarnings("unchecked")
	Site save(Site site);
}
