package com.reno.property.brothers.application.model.mapper;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.domain.database.Sale;
import com.reno.property.brothers.application.vo.forRetails.SaleVO;
@Component
public class SaleModelMapper {
	
	@Autowired
	 ModelMapper modelMapper;
	
	public Sale getSaleEntity(SaleVO saleVO) {		 
		 Sale sale = modelMapper.map(saleVO, Sale.class);
		 sale.setCreateDate(new Date());
		 sale.setCreateBy("ADMIN");
		 return sale;
		
	}
	
	public SaleVO getSaleVO(Sale sale) {	 		 
		 SaleVO saleVO = modelMapper.map(sale, SaleVO.class);		 
		 return saleVO;		
	}

}
