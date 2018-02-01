package com.songa.ravi.spring.java.interceptors;

import javax.servlet.http.HttpServletRequest;

import com.songa.ravi.spring.java.custom.exceptions.CustomException1;

public class HeaderValidation {
	
	public static boolean validateRequestHeaders(HttpServletRequest request) throws Exception {
		
		System.out.println("request.getHeaders() ==> " + request.getHeader("user"));
		
		if (request.getHeader("user") == null) 
			throw new CustomException1(500, "Invalid header value for user");
		
		return true;
		
	}

}
