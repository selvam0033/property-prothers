package com.reno.property.brothers.application.dao.funtions;

import com.reno.property.brothers.application.vo.forRegistration.DealerVO;

public interface DealerFunction {
	DealerVO saveDealer(DealerVO dealerVO);
	DealerVO getId(String id);
}
