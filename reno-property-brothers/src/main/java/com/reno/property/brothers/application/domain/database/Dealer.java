package com.reno.property.brothers.application.domain.database;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Dealer {
	@Id
	@Column(name = "dealerUniqueId")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="dealerUniqueId")
	@SequenceGenerator(name="dealerUniqueId", sequenceName="dealerUniqueId")
	private int dealerUniqueId;
	
	private String dealerName;
	private String dealerAddress;
	private String product;
	private String measurement;
	private int price;
	private boolean active;
	private Date createDate;
	private String createBy;	
	private String grade;
	private String dealerId;
	


	public String getDealerId() {
		return dealerId;
	}
	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}
	public int getDealerUniqueId() {
		return dealerUniqueId;
	}
	public void setDealerUniqueId(int dealerUniqueId) {
		this.dealerUniqueId = dealerUniqueId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getMeasurement() {
		return measurement;
	}
	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = true;
	}
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	

}
