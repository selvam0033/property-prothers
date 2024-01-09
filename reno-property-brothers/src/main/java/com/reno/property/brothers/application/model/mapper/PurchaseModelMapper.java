package com.reno.property.brothers.application.model.mapper;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.domain.database.Purchase;
import com.reno.property.brothers.application.vo.forRetails.PurchaseVO;
@Component
public class PurchaseModelMapper {
	
	@Autowired
	 ModelMapper modelMapper;
	
	public Purchase getPurchaseEntity(PurchaseVO saleVO) {		 
		Purchase purchase = modelMapper.map(saleVO, Purchase.class);
		purchase.setCreateDate(new Date());
		purchase.setCreateBy("ADMIN");
		 return purchase;
		
	}
	
	public PurchaseVO getPurchaseVO(Purchase purchase) {	 		 
		PurchaseVO purchaseVO = modelMapper.map(purchase, PurchaseVO.class);		 
		 return purchaseVO;		
	}

}
