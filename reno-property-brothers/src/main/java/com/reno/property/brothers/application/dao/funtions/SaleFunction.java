package com.reno.property.brothers.application.dao.funtions;

import com.reno.property.brothers.application.vo.forRetails.SaleVO;

public interface SaleFunction {
	
	SaleVO findTopByOrderById(String id);
	SaleVO saveSale(SaleVO saleVO);

}
