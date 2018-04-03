package com.songa.ravi.spring.java.response;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.songa.ravi.spring.java.models.ErrorMessage;

@ControllerAdvice 
public class CustomResponse implements ResponseBodyAdvice<Object> {

	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		return true;
	}


//	public ResponseWrapper beforeBodyWrite(ResponseWrapper body, MethodParameter returnType,
//			MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType,
//			ServerHttpRequest request, ServerHttpResponse response) {
//		ResponseWrapper rs = new ResponseWrapper();
//		rs.setOk(true);
//		rs.setError("no error");
//		rs.setPayload("this is the payload");
//		return rs;
//	}


	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
			ServerHttpResponse response) {
		ResponseWrapper rs = new ResponseWrapper();
		
		if (null == body) {
			response.setStatusCode(HttpStatus.NO_CONTENT);
			return null;
		}
		boolean okFlag = (body instanceof ErrorMessage) ? false : true;

		rs.setOk(okFlag);

		if (okFlag) {
			rs.setPayload(body);
		} else {
			rs.setError(body);
		}
		
		return rs;
	}

	

}
