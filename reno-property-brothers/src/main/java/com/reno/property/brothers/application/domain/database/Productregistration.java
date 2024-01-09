package com.reno.property.brothers.application.domain.database;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Productregistration {
	
	@Id
	@Column(name = "prodRegUniqueId")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="prodRegUniqueId")
	@SequenceGenerator(name="prodRegUniqueId", sequenceName="prodRegUniqueId")
	private int prodRegUniqueId;
	private String prodRegId;
	private String dealerName;
	private String grade;
	private boolean active;
	private Date createDate;
	private String createBy;
	private int salePrice;
	private int purchasePrice;
	private String product;
	
	
	
	public String getProdRegId() {
		return prodRegId;
	}
	public void setProdRegId(String prodRegId) {
		this.prodRegId = prodRegId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	
	
	public int getProdRegUniqueId() {
		return prodRegUniqueId;
	}
	public void setProdRegUniqueId(int prodRegUniqueId) {
		this.prodRegUniqueId = prodRegUniqueId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
	
	

}
