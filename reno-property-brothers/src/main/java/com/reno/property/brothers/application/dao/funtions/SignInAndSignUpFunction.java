package com.reno.property.brothers.application.dao.funtions;

import com.reno.property.brothers.application.vo.forBase.LoginVO;

public interface SignInAndSignUpFunction {
	
	LoginVO signIn(String userName);
	String signUp();

}
