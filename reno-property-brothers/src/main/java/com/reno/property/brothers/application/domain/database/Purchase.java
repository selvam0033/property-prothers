package com.reno.property.brothers.application.domain.database;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Purchase")
public class Purchase {
	
	@Id
	@Column(name = "purchaseUniqeId")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="purchaseUniqeId")
	@SequenceGenerator(name="purchaseUniqeId", sequenceName="purchaseUniqeId")
	private int purchaseUniqeId;
	private String purchaseid;
	private String site;
	private String bound;
	private String dealer;
	private String product;
	private int unit;
	private int totalPrice;
	private int currentPrice;
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
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(int currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public int getPurchaseUniqeId() {
		return purchaseUniqeId;
	}
	public void setPurchaseUniqeId(int purchaseUniqeId) {
		this.purchaseUniqeId = purchaseUniqeId;
	}
	public String getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(String purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getBound() {
		return bound;
	}
	public void setBound(String bound) {
		this.bound = bound;
	}
	public String getDealer() {
		return dealer;
	}
	public void setDealer(String dealer) {
		this.dealer = dealer;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}

	
}
