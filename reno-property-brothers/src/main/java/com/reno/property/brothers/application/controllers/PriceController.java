package com.reno.property.brothers.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reno.property.brothers.application.dao.impl.ProductRegistrationImpl;
import com.reno.property.brothers.application.vo.forBase.PurchasePriceVO;
import com.reno.property.brothers.application.vo.forBase.SalePriceVO;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/reno/project/")
public class PriceController {
	
	@Autowired
	ProductRegistrationImpl productRegistrationImpl;
	
	@GetMapping("sale/price")
	public SalePriceVO getSalePrice(@RequestParam String product,
			@RequestParam String dealerName,
			@RequestParam String grade
			) {
	 
		return productRegistrationImpl.findBySalePrice(product, dealerName, grade);
	}
	
	@GetMapping("purchase/price")
	public PurchasePriceVO getPurchasePrice(@RequestParam String product,
			@RequestParam String dealerName,
			@RequestParam String grade
			) {
	 
		return productRegistrationImpl.findByPurchasePrice(product, dealerName, grade);
	}


}
