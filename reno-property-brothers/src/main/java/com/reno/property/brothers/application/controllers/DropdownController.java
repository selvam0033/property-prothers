package com.reno.property.brothers.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reno.property.brothers.application.dao.funtions.DropDownFunction;
import com.reno.property.brothers.application.dao.impl.ProductRegistrationImpl;
import com.reno.property.brothers.application.vo.forBase.CategoryTypeListVO;
import com.reno.property.brothers.application.vo.forBase.ConstructionListVO;
import com.reno.property.brothers.application.vo.forBase.DealerListVO;
import com.reno.property.brothers.application.vo.forBase.DistrictListVO;
import com.reno.property.brothers.application.vo.forBase.EmployeeListVO;
import com.reno.property.brothers.application.vo.forBase.GradeListVO;
import com.reno.property.brothers.application.vo.forBase.ProductListVO;
import com.reno.property.brothers.application.vo.forBase.WorkCategoryListVO;
import com.reno.property.brothers.application.vo.forBase.ZipcodeListVO;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/reno/project/dropdown/")
public class DropdownController {
	
	@Autowired
	DropDownFunction dropDownFunction;
	
	@Autowired
	ProductRegistrationImpl productRegistrationImpl;
	
	@GetMapping("product")
	public ProductListVO getProducts() {		
		return  dropDownFunction.getAllDropdown();
	}
	
	@GetMapping("grade")
	public GradeListVO getGrade(@RequestParam String product,@RequestParam String dealerName ) {
	 
		return dropDownFunction.findByProductAndGrade(product, dealerName);
	}
	
	@GetMapping("dealer/{product}")
	public DealerListVO getDealer(@PathVariable String product) {	 
		return dropDownFunction.findDealerList(product);
	}
	
	@GetMapping("work/category/{data}")
	public WorkCategoryListVO getWorkCategory(@PathVariable String data) {	 
		return dropDownFunction.WorkCategoryList(data);
	}
	
	@GetMapping("distict")
	public DistrictListVO getDistrictList() {	 
		return dropDownFunction.getAllDistrict();
	}
	
	@GetMapping("zipcode/{dist}")
	public ZipcodeListVO getZipcodeList(@PathVariable String dist) {		
		return dropDownFunction.getAllZipCode(dist); 
	}
	

	@GetMapping("categoryType")
	public CategoryTypeListVO getCategoryType() {		
		return dropDownFunction.getCategoryType(); 
	}

	@GetMapping("construction/{construction}")
	public ConstructionListVO getConstructionList(@PathVariable String construction) {		
		return dropDownFunction.getConstructionList(construction); 
	}
	
	@GetMapping("employeeId/{data}")
	public EmployeeListVO getEmployeeIdList(@PathVariable String data) {	
		return dropDownFunction.getEmployeeIdList(data); 
	}

}
