package com.reno.property.brothers.application.dao.funtions;

import com.reno.property.brothers.application.vo.forRetails.PurchaseVO;

public interface PurchaseFunction {
	PurchaseVO findTopByOrderById(String id);
	
	PurchaseVO savePurchase(PurchaseVO PurchaseVO);
}
