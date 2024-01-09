package com.reno.property.brothers.application.dao.funtions;

import com.reno.property.brothers.application.vo.forRegistration.SiteVO;

public interface SiteFunction {
	
	SiteVO findTopByOrderById(String id,String bound,String district,String zipcode);
	SiteVO saveSite(SiteVO siteVO);
}
