package com.reno.property.brothers.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.reno.property.brothers.application.customException.RenoCustomException;
import com.reno.property.brothers.application.vo.forBase.ErrorVO;

@ControllerAdvice
public class RenoExceptionController extends ResponseEntityExceptionHandler  {
	
	@ExceptionHandler(value=RenoCustomException.class)
	public ResponseEntity<Object> handleRenoCustomException(RenoCustomException ex, WebRequest web){
		ErrorVO error = new ErrorVO();
		error.setMessage(ex.getMessage());
		error.setId(500);
		return ResponseEntity.ok().body(error);
	}
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest web){
		ErrorVO error = new ErrorVO();
		error.setMessage(ex.getMessage());
		error.setId(500);
		return ResponseEntity.ok().body(error);
	}

}
