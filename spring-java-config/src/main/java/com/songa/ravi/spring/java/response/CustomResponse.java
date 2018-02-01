package com.songa.ravi.spring.java.response;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice(basePackages = "com.songa.ravi.spring.java")
public class CustomResponse implements ResponseBodyAdvice {

	public boolean supports(MethodParameter returnType, Class converterType) {
		return true;
	}

	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		
		ResponseWrapper responseWrapper = new ResponseWrapper();
		
		
        return body;
	}

	

}
