package com.reno.property.brothers.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reno.property.brothers.application.dao.impl.ProductRegistrationImpl;
import com.reno.property.brothers.application.vo.forRegistration.ProductVO;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/reno/project/registration/")
public class ProductController {
	
	@Autowired
	ProductRegistrationImpl productRegistrationImpl;
	
	@GetMapping("product/{id}")
	public  ProductVO getSaleId(@PathVariable String id) {
		return productRegistrationImpl.findTopByOrderById(id);
	}
	
	@PostMapping("product")
	public  ProductVO saveSale(@RequestBody ProductVO productVO) {
		return productRegistrationImpl.saveProductRegistration(productVO);
	}

}