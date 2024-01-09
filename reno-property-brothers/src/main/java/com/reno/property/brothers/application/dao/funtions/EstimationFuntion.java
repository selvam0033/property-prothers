package com.reno.property.brothers.application.dao.funtions;

import com.reno.property.brothers.application.vo.forAssociation.EstimationAssociationVO;
import com.reno.property.brothers.application.vo.forAssociation.FillUpSandOnBasementAssociationVO;
import com.reno.property.brothers.application.vo.forAssociation.PillarPoolAssociationVO;

public interface EstimationFuntion {
	
	EstimationAssociationVO getEstimationId();
	EstimationAssociationVO saveEstimation(EstimationAssociationVO EstimationVO);
	PillarPoolAssociationVO savePillarPool(PillarPoolAssociationVO pillarPoolAssociationVO);
	FillUpSandOnBasementAssociationVO saveFillUpSand(FillUpSandOnBasementAssociationVO fillUpSandOnBasementAssociationVO);
}
