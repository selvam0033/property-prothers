package com.reno.property.brothers.application.vo.forAssociation;

import java.util.Date;

public class EstimationAssociationVO {
	
	private String estimateId;
	private int estimateUniqueId;
	private String site;
	private String bound;	
	private String owner;
	private String address;
	private int sqft;
	private boolean active;
	private Date createDate;
	private String createBy;
	
	
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
	public String getEstimateId() {
		return estimateId;
	}
	public void setEstimateId(String estimateId) {
		this.estimateId = estimateId;
	}
	public int getEstimateUniqueId() {
		return estimateUniqueId;
	}
	public void setEstimateUniqueId(int estimateUniqueId) {
		this.estimateUniqueId = estimateUniqueId;
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
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSqft() {
		return sqft;
	}
	public void setSqft(int sqft) {
		this.sqft = sqft;
	}
	
	

}
