package com.reno.property.brothers.application.vo.forRegistration;

import java.util.Date;

public class ProductVO {
	
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
	public int getProdRegUniqueId() {
		return prodRegUniqueId;
	}
	public void setProdRegUniqueId(int prodRegUniqueId) {
		this.prodRegUniqueId = prodRegUniqueId;
	}
	public String getProdRegId() {
		return prodRegId;
	}
	public void setProdRegId(String prodRegId) {
		this.prodRegId = prodRegId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
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
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	

}
