package com.reno.property.brothers.application.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.dao.funtions.SaleFunction;
import com.reno.property.brothers.application.model.mapper.SaleModelMapper;
import com.reno.property.brothers.application.repository.SaleRepository;
import com.reno.property.brothers.application.vo.forRetails.SaleVO;

@Component
public class SaleImpl implements SaleFunction {
	
    @Autowired
	SaleRepository saleRepository;
    
    @Autowired
    SaleModelMapper saleModelMapper;
	
	@Override
	public SaleVO findTopByOrderById(String saleId) {
		SaleVO sale  = null;
		if(saleId.equalsIgnoreCase("NEW")) {
			sale  = new SaleVO();
		int id = saleRepository.findTopByOrderById()+1;
		sale.setSaleid("SLID-"+id);
		}else {
			sale= saleModelMapper.getSaleVO(saleRepository.findBySaleid(saleId));
		}
		return sale;
	}

	@Override
	public SaleVO saveSale(SaleVO saleVO) {		
		return saleModelMapper.getSaleVO(saleRepository.save(saleModelMapper.getSaleEntity(saleVO)));
	}
	
	

}
