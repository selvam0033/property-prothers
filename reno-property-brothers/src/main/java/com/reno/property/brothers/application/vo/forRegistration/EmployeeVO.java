package com.reno.property.brothers.application.vo.forRegistration;

import java.io.Serializable;

public class EmployeeVO implements Serializable {
	

    /**
	 * 
	 */
private static final long serialVersionUID = 1L;
	
	
private int empUniqueid;   
private String empId;
private String name;
private String address;
private String work;
private String phone;
private String workCategory;
private String referal;



public int getEmpUniqueid() {
	return empUniqueid;
}
public void setEmpUniqueid(int empUniqueid) {
	this.empUniqueid = empUniqueid;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getWork() {
	return work;
}
public void setWork(String work) {
	this.work = work;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getWorkCategory() {
	return workCategory;
}
public void setWorkCategory(String workCategory) {
	this.workCategory = workCategory;
}
public String getReferal() {
	return referal;
}
public void setReferal(String referal) {
	this.referal = referal;
}



}
