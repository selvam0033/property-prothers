package com.reno.property.brothers.application.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.dao.funtions.SiteFunction;
import com.reno.property.brothers.application.model.mapper.SiteRegistrationModelMapper;
import com.reno.property.brothers.application.repository.SiteRepository;
import com.reno.property.brothers.application.vo.forRegistration.SiteVO;
@Component
public class SiteImpl implements SiteFunction{

	@Autowired
	SiteRepository siteRepository;
	
	  @Autowired
	  SiteRegistrationModelMapper siteRegistrationModelMapper;
	
	@Override
	public SiteVO findTopByOrderById(String id,String bound,String district,String zipcode) {
		
		SiteVO SiteId = new SiteVO();
		int site = siteRepository.findTopByOrderById()+1;
		if(id.equalsIgnoreCase("new")) 
			SiteId.setRegisterSiteId(district.substring(0, 3).toUpperCase()+zipcode.substring(zipcode.length()-2, zipcode.length())+"-"+bound+"-S-"+site);
		return SiteId;
	}
	
	@Override
	public SiteVO saveSite(SiteVO siteVO) {		
		return siteRegistrationModelMapper.getSiteVO(siteRepository.save(siteRegistrationModelMapper.getSiteEntity(siteVO)));
	}
	

}
