package com.reno.property.brothers.application.model.mapper;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.domain.database.Site;
import com.reno.property.brothers.application.vo.forRegistration.SiteVO;
@Component
public class SiteRegistrationModelMapper {
	
	@Autowired
	 ModelMapper modelMapper;
	
	public Site getSiteEntity(SiteVO siteVO) {		 
		Site site = modelMapper.map(siteVO, Site.class);
		site.setCreateDate(new Date());
		site.setCreateBy("ADMIN");
		 return site;
		
	}
	
	public SiteVO getSiteVO(Site site) {	 		 
		SiteVO siteVO = modelMapper.map(site, SiteVO.class);		 
		 return siteVO;		
	}

}
