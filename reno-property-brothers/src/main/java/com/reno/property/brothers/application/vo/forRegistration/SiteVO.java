package com.reno.property.brothers.application.vo.forRegistration;

import java.util.Date;

public class SiteVO {
	
	private int siteUniqueId;	
	private String bound;
	private String registerSiteId;
	private String siteOwner;
	private String address;
	private String distict;
	private String state;
	private String zipcode;
	private int sqft;
	private boolean active;
	private Date createDate;
	private String createBy;
	public int getSiteUniqueId() {
		return siteUniqueId;
	}
	public void setSiteUniqueId(int siteUniqueId) {
		this.siteUniqueId = siteUniqueId;
	}
	public String getBound() {
		return bound;
	}
	public void setBound(String bound) {
		this.bound = bound;
	}
	public String getRegisterSiteId() {
		return registerSiteId;
	}
	public void setRegisterSiteId(String registerSiteId) {
		this.registerSiteId = registerSiteId;
	}
	public String getSiteOwner() {
		return siteOwner;
	}
	public void setSiteOwner(String siteOwner) {
		this.siteOwner = siteOwner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistict() {
		return distict;
	}
	public void setDistict(String distict) {
		this.distict = distict;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public int getSqft() {
		return sqft;
	}
	public void setSqft(int sqft) {
		this.sqft = sqft;
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
