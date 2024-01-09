package com.reno.property.brothers.application.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reno.property.brothers.application.customException.RenoCustomException;
import com.reno.property.brothers.application.dao.funtions.SignInAndSignUpFunction;
import com.reno.property.brothers.application.domain.database.User;
import com.reno.property.brothers.application.repository.SignInAndSignUpRepository;
import com.reno.property.brothers.application.vo.forBase.LoginVO;

@Component
public class SignInAndSignUpImpl implements SignInAndSignUpFunction{

   @Autowired
   SignInAndSignUpRepository signInAndSignUpRepository;
   
	@Override
	public LoginVO signIn(String userName) {
		LoginVO login = new LoginVO();
		User user = signInAndSignUpRepository.findByUserName(userName);
		if(user==null)
			throw new RenoCustomException("User is not available, Please SignUp");
		if(user!=null && !user.isActive())
			throw new RenoCustomException("User is not Active, Please contact administrator");
		else {
			login.setUserName(user.getUserName());
			login.setPassword(user.getPassword());
		}
		
		return login ;
	}

	@Override
	public String signUp() {
		// TODO Auto-generated method stub
		return null;
	}

}
