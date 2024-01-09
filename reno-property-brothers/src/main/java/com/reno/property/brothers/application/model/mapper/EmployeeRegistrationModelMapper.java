package com.reno.property.brothers.application.model.mapper;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.domain.database.Employee;
import com.reno.property.brothers.application.vo.forRegistration.EmployeeVO;
@Component
public class EmployeeRegistrationModelMapper {
	
	
	@Autowired
	 ModelMapper modelMapper;
	
	public Employee getEmployeeEntity(EmployeeVO employeeVO) {		 
		Employee employee = modelMapper.map(employeeVO, Employee.class);
		employee.setCreateDate(new Date());
		employee.setCreateBy("ADMIN");
	    return employee;
		
	}
	
	public EmployeeVO getEmployeeVO(Employee employee) {	 		 
		EmployeeVO employeeVO = modelMapper.map(employee, EmployeeVO.class);		 
		 return employeeVO;		
	}

}
