package com.reno.property.brothers.application.domain.database;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class PillarPool {	
	@Id
	@Column(name = "pillarUniquePoolId")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="pillarUniquePoolId")
	@SequenceGenerator(name="pillarUniquePoolId", sequenceName="pillarUniquePoolId")
	private int pillarUniquePoolId;
	private String estimateId;
	private String site;
	private int jcbRentcost;
	private String work;
	private String dayORHour;
	private int manpowercost;
	private int estimatedcost;
	private boolean manpower;
	private int manpowertotalcost;
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

	public int getPillarUniquePoolId() {
		return pillarUniquePoolId;
	}
	
	public void setPillarUniquePoolId(int pillarUniquePoolId) {
		this.pillarUniquePoolId = pillarUniquePoolId;
	}
	public String getEstimateId() {
		return estimateId;
	}
	public void setEstimateId(String estimateId) {
		this.estimateId = estimateId;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public int getJcbRentcost() {
		return jcbRentcost;
	}
	public void setJcbRentcost(int jcbRentcost) {
		this.jcbRentcost = jcbRentcost;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getDayORHour() {
		return dayORHour;
	}
	public void setDayORHour(String dayORHour) {
		this.dayORHour = dayORHour;
	}
	public int getManpowercost() {
		return manpowercost;
	}
	public void setManpowercost(int manpowercost) {
		this.manpowercost = manpowercost;
	}
	public int getEstimatedcost() {
		return estimatedcost;
	}
	public void setEstimatedcost(int estimatedcost) {
		this.estimatedcost = estimatedcost;
	}

	public int getManpowertotalcost() {
		return manpowertotalcost;
	}
	public void setManpowertotalcost(int manpowertotalcost) {
		this.manpowertotalcost = manpowertotalcost;
	}

	public boolean isManpower() {
		return manpower;
	}

	public void setManpower(boolean manpower) {
		this.manpower = manpower;
	}
	
	
	

}
