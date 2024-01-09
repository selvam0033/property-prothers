package com.reno.property.brothers.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reno.property.brothers.application.dao.impl.PurchaseImpl;
import com.reno.property.brothers.application.vo.forRetails.PurchaseVO;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/reno/project/retails/")
public class PurchaseController {
	
	@Autowired
	PurchaseImpl purchaseImpl;
	
	@GetMapping("purchase/{id}")
	public  PurchaseVO getSaleId(@PathVariable String id) {
		return purchaseImpl.findTopByOrderById(id);
	}
	
	@PostMapping("purchase")
	public  PurchaseVO saveSale(@RequestBody com.reno.property.brothers.application.vo.forRetails.PurchaseVO purchaseVO) {
		return purchaseImpl.savePurchase(purchaseVO);
	}
}
