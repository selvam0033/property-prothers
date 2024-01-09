package com.reno.property.brothers.application.dao.funtions;

import com.reno.property.brothers.application.vo.forAssociation.EmployeeAssociationVO;
import com.reno.property.brothers.application.vo.forRegistration.EmployeeVO;

public interface EmployeeFunction {
	
	EmployeeVO getId(String id);
	EmployeeVO saveEmployee(EmployeeVO employeeVO);
	EmployeeAssociationVO saveEmployeeAssociation(EmployeeAssociationVO employeeAssociationVO);

}
