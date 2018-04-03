package com.songa.ravi.spring.version.five.controllers.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.songa.ravi.spring.version.five.controllers.IRest;

@RequestMapping("/rest/")
@RestController
public class RestImpl implements IRest {

	@Override
	@GetMapping("/get")
	public ResponseEntity<?> simplyGet() {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Hello World");
	}
	
	

}
