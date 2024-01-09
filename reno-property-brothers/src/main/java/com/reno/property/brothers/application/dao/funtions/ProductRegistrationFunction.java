package com.reno.property.brothers.application.dao.funtions;

import com.reno.property.brothers.application.vo.forBase.PurchasePriceVO;
import com.reno.property.brothers.application.vo.forBase.SalePriceVO;
import com.reno.property.brothers.application.vo.forRegistration.ProductVO;

public interface ProductRegistrationFunction {
	
	
	
	SalePriceVO findBySalePrice(String product, String dealerName,String grade);
	
	PurchasePriceVO findByPurchasePrice(String product, String dealerName,String grade);
	
	ProductVO findTopByOrderById(String id);
	
	ProductVO saveProductRegistration(ProductVO productVO);
}
