package com.reno.property.brothers.application.model.mapper;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.domain.database.Dealer;
import com.reno.property.brothers.application.vo.forRegistration.DealerVO;
@Component
public class DealerRegistrationModelMapper {
	
	
	@Autowired
	 ModelMapper modelMapper;
	
	public Dealer geDealerEntity(DealerVO dealerVO) {		 
		Dealer dealer = modelMapper.map(dealerVO, Dealer.class);
		dealer.setCreateDate(new Date());
		dealer.setCreateBy("ADMIN");
		 return dealer;
		
	}
	
	public DealerVO getDealerVO(Dealer dealer) {	 		 
		DealerVO dealerVO = modelMapper.map(dealer, DealerVO.class);		 
		 return dealerVO;		
	}

}
