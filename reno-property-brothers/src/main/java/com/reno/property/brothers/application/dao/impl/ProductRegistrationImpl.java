package com.reno.property.brothers.application.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.dao.funtions.ProductRegistrationFunction;
import com.reno.property.brothers.application.model.mapper.ProductRegistrationModelMapper;
import com.reno.property.brothers.application.repository.ProductRegistrationRepositroy;
import com.reno.property.brothers.application.vo.forBase.PurchasePriceVO;
import com.reno.property.brothers.application.vo.forBase.SalePriceVO;
import com.reno.property.brothers.application.vo.forRegistration.ProductVO;

@Component
public class ProductRegistrationImpl implements ProductRegistrationFunction{

	@Autowired
	ProductRegistrationRepositroy productRegistrationRepositroy;
	
	@Autowired
	ProductRegistrationModelMapper productRegistrationModelMapper;
	

	@Override
	public SalePriceVO findBySalePrice(String product, String dealerName,String grade) {
		
		SalePriceVO price = new SalePriceVO();
		
		price.setPrice(productRegistrationRepositroy.
				findByProductGradePrice(product, dealerName, grade).getSalePrice()
				);
   
		
		return price;
	}


	@Override
	public PurchasePriceVO findByPurchasePrice(String product, String dealerName, String grade) {
		PurchasePriceVO price = new PurchasePriceVO();
		
		price.setPrice(productRegistrationRepositroy.
				findByProductGradePrice(product, dealerName, grade).getPurchasePrice()
				);
		
		return price;
	}


	@Override
	public ProductVO findTopByOrderById(String id) {
		ProductVO productId = new ProductVO();
		int regId = productRegistrationRepositroy.findTopByOrderById()+1;
		if(id.equalsIgnoreCase("new")) {
			productId.setProdRegId("PRID-"+regId);			
		}
		return productId;
	}


	@Override
	public ProductVO saveProductRegistration(ProductVO productVO) {
	
		return productRegistrationModelMapper.getProductVO(
		productRegistrationRepositroy.save(productRegistrationModelMapper.getProductEntity(productVO)));
	
	}
	
	
}
