package com.reno.property.brothers.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reno.property.brothers.application.dao.impl.EmployeeImpl;
import com.reno.property.brothers.application.vo.forAssociation.EmployeeAssociationVO;
import com.reno.property.brothers.application.vo.forRegistration.EmployeeVO;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/reno/project/")
public class EmployeeController {
	
	@Autowired
	EmployeeImpl employeeImpl;
	
	@GetMapping("registration/employee/{id}")
	public EmployeeVO getId(@PathVariable String id) {	 
		return employeeImpl.getId(id);
	}
	
	@PostMapping("registration/employee")
	public  EmployeeVO saveEmployee(@RequestBody EmployeeVO employeeVO) {
		return employeeImpl.saveEmployee(employeeVO);
	}
	

	@PostMapping("association/employee")
	public  EmployeeAssociationVO saveEmployeeAssociation(@RequestBody EmployeeAssociationVO employeeAssociationVO) {
		return employeeImpl.saveEmployeeAssociation(employeeAssociationVO);
	}
	
}
