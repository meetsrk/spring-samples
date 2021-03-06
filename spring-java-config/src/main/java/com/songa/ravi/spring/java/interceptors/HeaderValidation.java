package com.songa.ravi.spring.java.interceptors;

import javax.servlet.http.HttpServletRequest;

import com.songa.ravi.spring.java.custom.exceptions.CustomException1;
import com.songa.ravi.spring.java.models.Student;

public class HeaderValidation {
	
	public static boolean validateRequestHeaders(HttpServletRequest request) throws Exception {
		
		System.out.println("request.getHeaders() ==> " + request.getHeader("user"));
		
		if (request.getHeader("user") == null) 
			throw new CustomException1(500, "Invalid header value for user");
		
		return true;
		
	}
	
	public static Student initializeHeaders(HttpServletRequest request) throws Exception {
		
		System.out.println("request.getHeaders() ==> " + request.getHeader("user"));
		
		Student student = new Student();
		
		student.setId(Integer.parseInt(request.getHeader("id"))); 
		student.setName(request.getHeader("user"));
		student.setAge(Integer.parseInt(request.getHeader("age")));
		
		return student;
		
	}

}
