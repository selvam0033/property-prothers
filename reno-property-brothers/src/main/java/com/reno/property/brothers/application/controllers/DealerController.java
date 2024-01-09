package com.reno.property.brothers.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reno.property.brothers.application.dao.impl.DealerImpl;
import com.reno.property.brothers.application.vo.forRegistration.DealerVO;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/reno/project/registration/")
public class DealerController {
	
	@Autowired
	DealerImpl dealerImpl;
	
	@GetMapping("dealer/{id}")
	public DealerVO getId(@PathVariable String id) {	 
		return dealerImpl.getId(id);
	}
	
	
	@PostMapping("dealer")
	public  DealerVO saveEmployee(@RequestBody DealerVO dealerVO) {
		return dealerImpl.saveDealer(dealerVO);
	}

}
