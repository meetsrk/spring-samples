package com.songa.ravi.spring.java.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.songa.ravi.spring.java.interceptors.HeaderValidation;
import com.songa.ravi.spring.java.interceptors.TransactionMarking;

public class CommonInterceptor implements HandlerInterceptor {


	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		TransactionMarking.markStartTime(request);		
		HeaderValidation.validateRequestHeaders(request);
//		HeaderValidation.initializeHeaders(request);
	
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		TransactionMarking.markExecutionTime(request);
		

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		TransactionMarking.printExecutionTime(request);
		
	}

}
