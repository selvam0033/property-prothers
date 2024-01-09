package com.reno.property.brothers.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reno.property.brothers.application.domain.database.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	@Query(value="select employee0_.emp_Uniqueid from employee employee0_ order by employee0_.emp_Uniqueid  DESC LIMIT 1 ", nativeQuery = true)
	int findTopByOrderById();
	
	List<Employee> findByWork(String work);
	
	@SuppressWarnings("unchecked")
	Employee save(Employee employee);
	
	
}
