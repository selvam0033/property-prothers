package com.reno.property.brothers.application.dao.impl;


import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.dao.funtions.DropDownFunction;
import com.reno.property.brothers.application.repository.CategoryTypeRepository;
import com.reno.property.brothers.application.repository.ConstructionRepository;
import com.reno.property.brothers.application.repository.DealerRepository;
import com.reno.property.brothers.application.repository.DistrictRepository;
import com.reno.property.brothers.application.repository.EmployeeRepository;
import com.reno.property.brothers.application.repository.InAndOutBoundRepository;
import com.reno.property.brothers.application.repository.ProductRepository;
import com.reno.property.brothers.application.repository.SiteRepository;
import com.reno.property.brothers.application.repository.WorkCategoryRepository;
import com.reno.property.brothers.application.repository.ZipcodeRepository;
import com.reno.property.brothers.application.vo.forBase.CategoryTypeListVO;
import com.reno.property.brothers.application.vo.forBase.ConstructionListVO;
import com.reno.property.brothers.application.vo.forBase.DealerListVO;
import com.reno.property.brothers.application.vo.forBase.DistrictListVO;
import com.reno.property.brothers.application.vo.forBase.EmployeeListVO;
import com.reno.property.brothers.application.vo.forBase.GradeListVO;
import com.reno.property.brothers.application.vo.forBase.ProductListVO;
import com.reno.property.brothers.application.vo.forBase.WorkCategoryListVO;
import com.reno.property.brothers.application.vo.forBase.ZipcodeListVO;

@Component
public class DropDown_Impl implements DropDownFunction {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	InAndOutBoundRepository inAndOutBoundRepository;
	
	@Autowired
	SiteRepository siteRepository;
	
	@Autowired
	DealerRepository dealerRepository;
	
	@Autowired
	WorkCategoryRepository workCategoryRepository;
	
	@Autowired
	DistrictRepository districtRepository;
	
	@Autowired
	CategoryTypeRepository  categoryTypeRepository;
	
	@Autowired
	ConstructionRepository  constructionRepository;
	
	@Autowired
	EmployeeRepository  employeeRepository;
	
	@Autowired
	ZipcodeRepository  zipcodeRepository;
	
	@Override
	public ProductListVO getAllDropdown() {
	
		ProductListVO dropDown =new ProductListVO();	
		
		dropDown.setProduct(productRepository.findAll()
				.stream().map(a->a.getProduct())
				.collect(Collectors.toList()));		
		dropDown.getProduct().add(0,"Select");
		
		
		dropDown.setBound(inAndOutBoundRepository.findAll()
				.stream().map(a->a.getBound())
				.collect(Collectors.toList()));
		dropDown.getBound().add(0,"Select");
		
		dropDown.setInBound(siteRepository
				.findAll()
				.stream()
				.filter(a->a.getActive()==true)
				.filter(a->a.getBound().equalsIgnoreCase("IN"))
				.map(a->a.getRegisterSiteId())
				.collect(Collectors.toList()));
		dropDown.getInBound().add(0,"Select");
		
		dropDown.setOutBound(siteRepository
				.findAll()
				.stream()
				.filter(a->a.getActive()==true)
				.filter(a->a.getBound().equalsIgnoreCase("OUT"))
				.map(a->a.getRegisterSiteId())
				.collect(Collectors.toList()));
		dropDown.getOutBound().add(0,"Select");
		
				
		
		return dropDown;
	}

	@Override
	public DealerListVO findDealerList(String product) {
		
		
		DealerListVO dealerList = new DealerListVO();	
	
		dealerList.setDealerList(dealerRepository.findByProduct(product)
				 .stream()				 
				 .filter(a->a.isActive())
				 .map(a->a.getDealerName())
				.collect(Collectors.toList()));
		
		dealerList.getDealerList().add(0,"Select");
	   
		
		return dealerList;
	}
	
	
	@Override
	public WorkCategoryListVO WorkCategoryList(String data) {		
		
		WorkCategoryListVO workCategoryList = new WorkCategoryListVO();	
	
		workCategoryList.setWorkCategoryList(workCategoryRepository.findAll()
				 .stream().filter(a->a.getWork().equalsIgnoreCase(data))				 
				  .map(a->a.getWorkCategory())
					.collect(Collectors.toList()));		
		
		workCategoryList.getWorkCategoryList().add(0,"Select");
	   
		
		return workCategoryList;
	}
	

	@Override
	public DistrictListVO getAllDistrict() {
		DistrictListVO districtList =new DistrictListVO();		
		districtList.setDistrictList(districtRepository.findAll()
				.stream().map(a->a.getDistrict())
				.collect(Collectors.toList()));	
		districtList.getDistrictList().add(0,"Select");
		return districtList;
	}	
	
	@Override
	public ZipcodeListVO getAllZipCode(String dist ) {
		
		ZipcodeListVO zip = new ZipcodeListVO();	
		
		zip.setZipCodeList(zipcodeRepository
			.findAll()
			.stream()
			.filter(a->a.getDistrict().equalsIgnoreCase(dist))
			.map(a->a.getZipcode()).distinct()
			.collect(Collectors.toList()));
		 zip.getZipCodeList().add(0,"Select");
		return zip;
	}
	
	
	@Override
	public CategoryTypeListVO getCategoryType() {
		
		CategoryTypeListVO categoryTypeList = new CategoryTypeListVO();	
		
		categoryTypeList.setCategoryType(categoryTypeRepository.findAll()
				.stream().map(a->a.getCategoryType())
				.collect(Collectors.toList()));	
		categoryTypeList.getCategoryType().add(0,"Select");
		
		return categoryTypeList;
	}
	
	@Override
	public ConstructionListVO getConstructionList(String str) {
		
		ConstructionListVO constructionList = new ConstructionListVO();	
		constructionList.setConstructionList(constructionRepository.findAll()
				.stream()
				.filter(a->a.getCategoryType().equalsIgnoreCase(str))
				.map(a->a.getConstructionType())
				.collect(Collectors.toList()));	
		     constructionList.getConstructionList().add(0,"Select");
		
		return constructionList; 
	}
	
	
	@Override
	public EmployeeListVO getEmployeeIdList(String str) {
		
		EmployeeListVO EmployeeList = new EmployeeListVO();	
		EmployeeList.setEmployeeList(employeeRepository.findByWork(str)
				.stream()			
				.map(a->a.getEmpId())
				.collect(Collectors.toList()));	
		EmployeeList.getEmployeeList().add(0,"Select");		
		return EmployeeList;
	}

	@Override
	public GradeListVO findByProductAndGrade(String product, String dealerName) {
		
		GradeListVO gradeList = new GradeListVO();
		
		gradeList.setGradeList(dealerRepository.
				findByProductGrade(product, dealerName)
				.stream()
				.filter(a->a.isActive())
				.map(a->a.getGrade())
				.collect(Collectors.toList()));
		gradeList.getGradeList().add(0,"Select");
		return gradeList;
	}
}
