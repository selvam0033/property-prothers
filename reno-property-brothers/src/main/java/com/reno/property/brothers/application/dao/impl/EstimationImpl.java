package com.reno.property.brothers.application.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.dao.funtions.EstimationFuntion;
import com.reno.property.brothers.application.model.mapper.EstimateAssociationModelMapper;
import com.reno.property.brothers.application.model.mapper.FillUpSandOnBasementModelMapper;
import com.reno.property.brothers.application.model.mapper.PillarPoolModelMapper;
import com.reno.property.brothers.application.repository.EstimationRepository;
import com.reno.property.brothers.application.repository.FillUpSandOnBasementRepository;
import com.reno.property.brothers.application.repository.PillarPoolRepository;
import com.reno.property.brothers.application.vo.forAssociation.EstimationAssociationVO;
import com.reno.property.brothers.application.vo.forAssociation.FillUpSandOnBasementAssociationVO;
import com.reno.property.brothers.application.vo.forAssociation.PillarPoolAssociationVO;
@Component
public class EstimationImpl implements EstimationFuntion {

	@Autowired
	EstimationRepository estimationRepository;
	
	@Autowired
	EstimateAssociationModelMapper estimateAssociationModelMapper;
	
	@Autowired
	PillarPoolModelMapper pillarPoolModelMapper;
	
	@Autowired
	PillarPoolRepository pillarPoolRepository;
	
	@Autowired
	FillUpSandOnBasementModelMapper fillUpSandOnBasementModelMapper;
	
	@Autowired
	FillUpSandOnBasementRepository fillUpSandOnBasementRepository;
	
	@Override
	public EstimationAssociationVO getEstimationId() {
		EstimationAssociationVO estimationId = new EstimationAssociationVO();
	    int id = estimationRepository.findTopByOrderById()+1;
	    estimationId.setEstimateId("ESTID-"+id);
		return estimationId;
	}
	
	
	@Override
	public EstimationAssociationVO saveEstimation(EstimationAssociationVO estimationVO) {		
		return estimateAssociationModelMapper
				.getEstimateVO(estimationRepository.
						save(estimateAssociationModelMapper.
								getEstimateEntity(estimationVO)));
	}
	
	
	@Override
	public PillarPoolAssociationVO savePillarPool(PillarPoolAssociationVO pillarPoolAssociationVO) {		
		return pillarPoolModelMapper
				.getPillarPoolVO(pillarPoolRepository.
						save(pillarPoolModelMapper.
								getPillarPoolEntity(pillarPoolAssociationVO)));
	}
	
	
	@Override
	public FillUpSandOnBasementAssociationVO saveFillUpSand(FillUpSandOnBasementAssociationVO fillUpSandOnBasementAssociationVO) {		
		return fillUpSandOnBasementModelMapper
				.getFillUpSandVO(fillUpSandOnBasementRepository.
						save(fillUpSandOnBasementModelMapper.
								getFillUpSandEntity(fillUpSandOnBasementAssociationVO)));
	}

}
