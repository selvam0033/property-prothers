package com.reno.property.brothers.application.domain.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Workcategory {
	@Id
	@Column(name = "workCategoryId")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="workCategoryId")
	@SequenceGenerator(name="workCategoryId", sequenceName="workCategoryId")
	private int workCategoryId;
	private String work;
	private String workCategory;	
	
	
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}

	public int getWorkCategoryId() {
		return workCategoryId;
	}
	public void setWorkCategoryId(int workCategoryId) {
		this.workCategoryId = workCategoryId;
	}
	public String getWorkCategory() {
		return workCategory;
	}
	public void setWorkCategory(String workCategory) {
		this.workCategory = workCategory;
	}
	
	

}
