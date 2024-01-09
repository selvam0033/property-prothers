package com.reno.property.brothers.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reno.property.brothers.application.dao.impl.EstimationImpl;
import com.reno.property.brothers.application.vo.forAssociation.EstimationAssociationVO;
import com.reno.property.brothers.application.vo.forAssociation.FillUpSandOnBasementAssociationVO;
import com.reno.property.brothers.application.vo.forAssociation.PillarPoolAssociationVO;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/reno/project/association/estimate")
public class EstimationController {
	
	@Autowired
	EstimationImpl estimationImpl;
	
	@GetMapping("/{id}")
	public  EstimationAssociationVO getEstimationId(@PathVariable String id) {
		return  estimationImpl.getEstimationId();
	}
	
	@PostMapping("/site")
	public  EstimationAssociationVO saveSite(@RequestBody EstimationAssociationVO estimationAssociationVO) {
		return estimationImpl.saveEstimation(estimationAssociationVO);
	}
	
	@PostMapping("/pillarPool")
	public  PillarPoolAssociationVO savePillarPool(@RequestBody PillarPoolAssociationVO pillarPoolAssociationVO) {
		return estimationImpl.savePillarPool(pillarPoolAssociationVO);
	}
	
	@PostMapping("/fillUpSandOnBasement")
	public  FillUpSandOnBasementAssociationVO savefillUpSandOnBasement(@RequestBody FillUpSandOnBasementAssociationVO fillUpSandOnBasementAssociationVO) {
		return estimationImpl.saveFillUpSand(fillUpSandOnBasementAssociationVO);
	}

}
