package com.reno.property.brothers.application.dao.funtions;

import com.reno.property.brothers.application.vo.forBase.CategoryTypeListVO;
import com.reno.property.brothers.application.vo.forBase.ConstructionListVO;
import com.reno.property.brothers.application.vo.forBase.DealerListVO;
import com.reno.property.brothers.application.vo.forBase.DistrictListVO;
import com.reno.property.brothers.application.vo.forBase.EmployeeListVO;
import com.reno.property.brothers.application.vo.forBase.GradeListVO;
import com.reno.property.brothers.application.vo.forBase.ProductListVO;
import com.reno.property.brothers.application.vo.forBase.WorkCategoryListVO;
import com.reno.property.brothers.application.vo.forBase.ZipcodeListVO;

public interface DropDownFunction {
	
	ProductListVO getAllDropdown();
	
	DealerListVO findDealerList(String str);
	
	WorkCategoryListVO WorkCategoryList(String data);
	
	DistrictListVO getAllDistrict();
	
    ZipcodeListVO getAllZipCode(String dist );
    
    CategoryTypeListVO getCategoryType();
    
    ConstructionListVO getConstructionList(String str);
    
    EmployeeListVO getEmployeeIdList(String str);
    
    GradeListVO findByProductAndGrade(String productName, String dealerName);

}
