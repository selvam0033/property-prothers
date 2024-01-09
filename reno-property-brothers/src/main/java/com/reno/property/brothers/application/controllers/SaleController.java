package com.reno.property.brothers.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reno.property.brothers.application.dao.impl.SaleImpl;
import com.reno.property.brothers.application.vo.forRetails.SaleVO;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/reno/project/retails/")
public class SaleController {
	
	@Autowired
	SaleImpl saleImpl;
	
	@GetMapping("sale/{id}")
	public  SaleVO getSaleId(@PathVariable String id) {	
		return saleImpl.findTopByOrderById(id);
	}
	
	@PostMapping("save/sale")
	public  SaleVO saveSale(@RequestBody com.reno.property.brothers.application.vo.forRetails.SaleVO saleVO) {
		return saleImpl.saveSale(saleVO);
	}

}
