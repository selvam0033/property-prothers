package com.reno.property.brothers.application.model.mapper;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.domain.database.FillUpSandOnBasement;
import com.reno.property.brothers.application.vo.forAssociation.FillUpSandOnBasementAssociationVO;

@Component
public class FillUpSandOnBasementModelMapper {
	
	@Autowired
	 ModelMapper modelMapper;
	
	public FillUpSandOnBasement getFillUpSandEntity(FillUpSandOnBasementAssociationVO fillUpSandOnBasementAssociationVO) {		 
		FillUpSandOnBasement fillUpSandOnBasement = modelMapper.map(fillUpSandOnBasementAssociationVO, FillUpSandOnBasement.class);
		fillUpSandOnBasement.setCreateDate(new Date());
		fillUpSandOnBasement.setCreateBy("ADMIN");
		 return fillUpSandOnBasement;
		
	}
	
	public FillUpSandOnBasementAssociationVO getFillUpSandVO(FillUpSandOnBasement fillUpSandOnBasement) {	 		 
		FillUpSandOnBasementAssociationVO fillUpSandOnBasementAssociationVO = modelMapper.map(fillUpSandOnBasement, FillUpSandOnBasementAssociationVO.class);		 
		 return fillUpSandOnBasementAssociationVO;		
	}


}
