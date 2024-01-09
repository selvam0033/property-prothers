package com.reno.property.brothers.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reno.property.brothers.application.dao.impl.SiteImpl;
import com.reno.property.brothers.application.vo.forRegistration.SiteVO;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/reno/project/registration/")
public class SiteController {
	@Autowired
	SiteImpl siteImpl;
	
	@GetMapping("site")
	public  SiteVO getSiteId(@RequestParam String id,
			@RequestParam String bound,
			@RequestParam String district,
			@RequestParam String zipcode
			) {
		return  siteImpl.findTopByOrderById(id,bound,district, zipcode);
	}
	
	
	@PostMapping("site")
	public  SiteVO saveSale(@RequestBody SiteVO siteVO) {
		return siteImpl.saveSite(siteVO);
	}

}

