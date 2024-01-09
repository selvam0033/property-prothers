package com.reno.property.brothers.application.model.mapper;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.domain.database.Productregistration;
import com.reno.property.brothers.application.vo.forRegistration.ProductVO;;
@Component
public class ProductRegistrationModelMapper {
	
	@Autowired
	 ModelMapper modelMapper;
	
	public Productregistration getProductEntity(ProductVO productVO) {		 
		Productregistration productRegistration = modelMapper.map(productVO, Productregistration.class);
		productRegistration.setCreateDate(new Date());
		productRegistration.setCreateBy("ADMIN");
	    return productRegistration;
		
	}
	
	public ProductVO getProductVO(Productregistration productRegistration) {	 		 
		ProductVO productVO = modelMapper.map(productRegistration, ProductVO.class);		 
		 return productVO;		
	}

}
