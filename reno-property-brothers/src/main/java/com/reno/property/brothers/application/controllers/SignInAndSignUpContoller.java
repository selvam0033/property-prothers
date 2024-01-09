package com.reno.property.brothers.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reno.property.brothers.application.customException.RenoCustomException;
import com.reno.property.brothers.application.dao.impl.SignInAndSignUpImpl;
import com.reno.property.brothers.application.vo.forBase.LoginVO;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/reno/project/sign/")
public class SignInAndSignUpContoller {
	
	@Autowired
	SignInAndSignUpImpl signInAndSignUpImpl;
	
	@GetMapping("in")
	public LoginVO signIn(@RequestParam String userName,
			@RequestParam String password) {
		LoginVO loginVO = signInAndSignUpImpl.signIn(userName);
		
		if(!loginVO.getUserName().equalsIgnoreCase(userName) ||
				!loginVO.getPassword().equalsIgnoreCase(password))			
					throw new RenoCustomException("Invalid User");	
	 
		return loginVO;
	}

}