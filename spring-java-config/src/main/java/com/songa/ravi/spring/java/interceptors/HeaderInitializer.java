package com.songa.ravi.spring.java.interceptors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import com.songa.ravi.spring.java.models.Student;

public class HeaderInitializer implements HttpMessageConverter<Student> {

	public boolean canRead(Class<?> clazz, MediaType mediaType) {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean canWrite(Class<?> clazz, MediaType mediaType) {
		return false;
	}

	public List<MediaType> getSupportedMediaTypes() {
		List<MediaType> mediaType = new ArrayList<MediaType>();
		mediaType.add(MediaType.APPLICATION_JSON);
		return mediaType;
	}

	public Student read(Class<? extends Student> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		System.out.print("Inside HTTP Message Convertors");
		return null;
	}

	public void write(Student t, MediaType contentType, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		// TODO Auto-generated method stub
		
	}


}
