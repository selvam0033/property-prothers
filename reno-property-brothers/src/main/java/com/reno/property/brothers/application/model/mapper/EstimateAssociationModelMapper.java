package com.reno.property.brothers.application.model.mapper;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.domain.database.Estimation;
import com.reno.property.brothers.application.vo.forAssociation.EstimationAssociationVO;

@Component
public class EstimateAssociationModelMapper {
	
	@Autowired
	 ModelMapper modelMapper;
	
	public Estimation getEstimateEntity(EstimationAssociationVO estimationVO) {		 
		Estimation estimation = modelMapper.map(estimationVO, Estimation.class);
		estimation.setCreateDate(new Date());
		estimation.setCreateBy("ADMIN");
		 return estimation;
		
	}
	
	public EstimationAssociationVO getEstimateVO(Estimation estimation) {	 		 
		EstimationAssociationVO estimationAssociationVO = modelMapper.map(estimation, EstimationAssociationVO.class);		 
		 return estimationAssociationVO;		
	}

}
