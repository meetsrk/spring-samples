package com.songa.ravi.spring.java.interceptors;

import javax.servlet.http.HttpServletRequest;

public class TransactionMarking {
	
	public static void markStartTime(HttpServletRequest request) {
	
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
	}
	
	public static void markExecutionTime(HttpServletRequest request) {
		
		long startTime = (Long)request.getAttribute("startTime");
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - startTime;
		request.setAttribute("executeTime", executeTime);
		
	}
	
	public static void printExecutionTime(HttpServletRequest request) {
		
		long executeTime = (Long) ((request.getAttribute("executeTime") == null) ? 0L : request.getAttribute("executeTime"));
		
		
		System.out.println("executeTime ==>" + executeTime);
	}

}
