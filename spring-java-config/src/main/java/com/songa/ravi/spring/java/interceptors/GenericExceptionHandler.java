package com.songa.ravi.spring.java.interceptors;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.songa.ravi.spring.java.custom.exceptions.CustomException1;
import com.songa.ravi.spring.java.custom.exceptions.CustomException2;
import com.songa.ravi.spring.java.models.ErrorMessage;

@ControllerAdvice
public class GenericExceptionHandler {


	@ResponseBody
	@ExceptionHandler(CustomException1.class)
	public ResponseEntity<Object> handleServiceException(HttpServletResponse response, CustomException1 e) {
		ErrorMessage errorMessage = new ErrorMessage(e.getCode(), e.getMessage());
		return new ResponseEntity<Object>(errorMessage, HttpStatus.BAD_REQUEST);
	}

	
	@ResponseBody
	@ExceptionHandler(CustomException2.class)
	public ResponseEntity<Object> handleServiceException(HttpServletResponse response, CustomException2 e) {
		ErrorMessage errorMessage = new ErrorMessage(e.getCode(), e.getMessage());
		return new ResponseEntity<Object>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ResponseBody
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<Object> handleServiceException(HttpServletResponse response, RuntimeException e) {
		ErrorMessage errorMessage = new ErrorMessage(500, e.getMessage());
		return new ResponseEntity<Object>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ResponseBody
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleServiceException(HttpServletResponse response, Exception e) {
		ErrorMessage errorMessage = new ErrorMessage(500, e.getMessage());
		return new ResponseEntity<Object>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
