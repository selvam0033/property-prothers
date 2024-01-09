package com.reno.property.brothers.application.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.dao.funtions.EmployeeFunction;
import com.reno.property.brothers.application.model.mapper.EmployeeAssociationModelMapper;
import com.reno.property.brothers.application.model.mapper.EmployeeRegistrationModelMapper;
import com.reno.property.brothers.application.repository.EmployeeAssociationRepository;
import com.reno.property.brothers.application.repository.EmployeeRepository;
import com.reno.property.brothers.application.vo.forAssociation.EmployeeAssociationVO;
import com.reno.property.brothers.application.vo.forRegistration.EmployeeVO;

@Component
public class EmployeeImpl implements EmployeeFunction {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeAssociationRepository employeeAssociationRepository;
	
    @Autowired
    EmployeeRegistrationModelMapper employeeRegistrationModelMapper;
    
    @Autowired
    EmployeeAssociationModelMapper employeeAssociationModelMapper;
	
	@Override
	public EmployeeVO getId(String id) {		
		EmployeeVO employee = new EmployeeVO();
		int empId = employeeRepository.findTopByOrderById()+1;
		if(id.equalsIgnoreCase("new")) 
		employee.setEmpId("EMPID-"+empId);		
		return employee;
	}
	
	
	@Override
	public EmployeeVO saveEmployee(EmployeeVO employeeVO) {		
		return employeeRegistrationModelMapper.getEmployeeVO((employeeRepository
				.save(employeeRegistrationModelMapper.getEmployeeEntity(employeeVO))));
	}
	
	@Override
	public EmployeeAssociationVO saveEmployeeAssociation(EmployeeAssociationVO employeeAssociationVO) {		
		return employeeAssociationModelMapper.getEmployeeAssociationVO(employeeAssociationRepository
				.save(employeeAssociationModelMapper.getEmployeeAssociationEntity(employeeAssociationVO)));
	}
}
