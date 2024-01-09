package com.reno.property.brothers.application.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.dao.funtions.PurchaseFunction;
import com.reno.property.brothers.application.model.mapper.PurchaseModelMapper;
import com.reno.property.brothers.application.repository.PurchaseRepository;
import com.reno.property.brothers.application.vo.forRetails.PurchaseVO;
@Component
public class PurchaseImpl implements PurchaseFunction {

	@Autowired
	PurchaseRepository purchaseRepository;
	
	  @Autowired
	    PurchaseModelMapper purchaseModelMapper;
	
	
	@Override
	public PurchaseVO findTopByOrderById(String id) {
		PurchaseVO purchase=new PurchaseVO();
		int purchaseId=purchaseRepository.findTopByOrderById()+1;
		if(id.equalsIgnoreCase("new")) {
			purchase.setPurchaseid("PRID-"+purchaseId);			
		}
		
		return purchase;
	}


	@Override
	public PurchaseVO savePurchase(PurchaseVO PurchaseVO) {		
		return  purchaseModelMapper.getPurchaseVO(purchaseRepository.save(purchaseModelMapper.getPurchaseEntity(PurchaseVO)));
	}

}
