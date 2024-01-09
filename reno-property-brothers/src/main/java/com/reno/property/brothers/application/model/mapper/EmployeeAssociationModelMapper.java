package com.reno.property.brothers.application.model.mapper;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.domain.database.EmployeeAssociation;
import com.reno.property.brothers.application.vo.forAssociation.EmployeeAssociationVO;
@Component
public class EmployeeAssociationModelMapper {
	
	@Autowired
	 ModelMapper modelMapper;
	
	public EmployeeAssociation getEmployeeAssociationEntity(EmployeeAssociationVO employeeAssociationVO) {		 
		EmployeeAssociation employee = modelMapper.map(employeeAssociationVO, EmployeeAssociation.class);
		employee.setCreateDate(new Date());
		employee.setCreateBy("ADMIN");
	    return employee;
		
	}
	
	public EmployeeAssociationVO getEmployeeAssociationVO(EmployeeAssociation employee) {	 		 
		EmployeeAssociationVO employeeAssociationVO = modelMapper.map(employee, EmployeeAssociationVO.class);		 
		 return employeeAssociationVO;		
	}


}
