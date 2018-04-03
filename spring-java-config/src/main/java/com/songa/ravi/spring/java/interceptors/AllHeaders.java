package com.songa.ravi.spring.java.interceptors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.annotation.RequestScope;

import com.songa.ravi.spring.java.models.Student;

@RequestScope
@ControllerAdvice
public class AllHeaders {


	@ModelAttribute("Student")
	public static Student initializeHeaders(HttpServletRequest request) throws Exception {
		
		System.out.println("request.getHeaders() ==> " + request.getHeader("user"));
		
		Student student = new Student();
		
		student.setId(Integer.parseInt(request.getHeader("id"))); 
		student.setName(request.getHeader("user"));
		student.setAge(Integer.parseInt(request.getHeader("age")));
		
		return student;
		
	}
}
