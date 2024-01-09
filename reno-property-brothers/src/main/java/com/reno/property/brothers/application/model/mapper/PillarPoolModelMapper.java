package com.reno.property.brothers.application.model.mapper;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.domain.database.PillarPool;
import com.reno.property.brothers.application.vo.forAssociation.PillarPoolAssociationVO;
@Component
public class PillarPoolModelMapper {
	
	@Autowired
	 ModelMapper modelMapper;
	
	public PillarPool getPillarPoolEntity(PillarPoolAssociationVO pillarPoolAssociationVO) {		 
		PillarPool pillarPool = modelMapper.map(pillarPoolAssociationVO, PillarPool.class);
		pillarPool.setCreateDate(new Date());
		pillarPool.setCreateBy("ADMIN");
		 return pillarPool;		
	}
	
	public PillarPoolAssociationVO getPillarPoolVO(PillarPool pillarPool) {	 		 
		PillarPoolAssociationVO pillarPoolAssociationVO = modelMapper.map(pillarPool, PillarPoolAssociationVO.class);		 
		 return pillarPoolAssociationVO;		
	}

}
