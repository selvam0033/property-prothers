package com.reno.property.brothers.application.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.dao.funtions.DealerFunction;
import com.reno.property.brothers.application.model.mapper.DealerRegistrationModelMapper;
import com.reno.property.brothers.application.repository.DealerRepository;
import com.reno.property.brothers.application.vo.forRegistration.DealerVO;
@Component
public class DealerImpl implements DealerFunction{
	@Autowired
	DealerRegistrationModelMapper dealerRegistrationModelMapper;
	@Autowired
	DealerRepository dealerRepository;

	@Override
	public DealerVO saveDealer(DealerVO dealerVO) {
		
		return  dealerRegistrationModelMapper.getDealerVO(dealerRepository.save(dealerRegistrationModelMapper.geDealerEntity(dealerVO)));
		
	}


	
	@Override
	public DealerVO getId(String id) {
		DealerVO dealerIdVO=new DealerVO();
		int  dealerId=dealerRepository.findTopByOrderById()+1;
		if(id.equalsIgnoreCase("new")) {
			dealerIdVO.setDealerId("DLR-"+dealerId);			
		}
		
		return dealerIdVO;
	}
	
}
