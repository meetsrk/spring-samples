package com.songa.ravi.spring.java.controllers.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.songa.ravi.spring.java.controllers.IControllers;
import com.songa.ravi.spring.java.custom.exceptions.CustomException1;
import com.songa.ravi.spring.java.custom.exceptions.CustomException2;

@RestController
@RequestMapping(value = "/java-config")
public class ControllersImpl implements IControllers {

	@GetMapping(value = "/example")
	public String javaConfigExample() {
		return "Implemented using java config for servlet and application config using SPRING 4.3.9-RELEASE";
	}
	
	
	@GetMapping(value = "/400")
//	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Order")
	public String javaException400() throws Exception {
		throw new CustomException1(2001, "New Custom 1 Exception");
	}
	
	@GetMapping(value = "/500")
//	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No such Order")
	public String javaException500() throws Exception {
		throw new CustomException2(2001, "New Custom 2 Exception");
	}

	@GetMapping(value = "/nullexception")
	public String javaException() throws Exception {
		throw new NullPointerException("NullPointerException");
	}
	
	@GetMapping(value = "/exception")
	public String javaException2() throws Exception {
		throw new IllegalAccessException("IllegalAccessException");
	}
	
//	 @ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Invalid Request")  // 404
//	 public class OrderNotFoundException extends RuntimeException {
//
//		public OrderNotFoundException(String string) {
//			// TODO Auto-generated constructor stub
//		}
//	     // ...
//	 }

}
