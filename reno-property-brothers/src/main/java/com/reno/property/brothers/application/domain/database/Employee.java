package com.reno.property.brothers.application.domain.database;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id
	@Column(name = "empUniqueid")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="empUniqueid")
	@SequenceGenerator(name="empUniqueid", sequenceName="empUniqueid")
	private int empUniqueid;	
	private String empId;
	private String name;
	private String address;
	private String work;
	private String phone;
	private String workCategory;
	private String referal;	
	private Date createDate;
	private String createBy;
	
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public int getEmpUniqueid() {
		return empUniqueid;
	}
	public void setEmpUniqueid(int empUniqueid) {
		this.empUniqueid = empUniqueid;
	}
	public String getWorkCategory() {
		return workCategory;
	}
	public void setWorkCategory(String workCategory) {
		this.workCategory = workCategory;
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
	public String getReferal() {
		return referal;
	}
	public void setReferal(String referal) {
		this.referal = referal;
	}
	
	
	
	
}
