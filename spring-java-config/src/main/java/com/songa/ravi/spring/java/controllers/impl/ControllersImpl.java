package com.songa.ravi.spring.java.controllers.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.songa.ravi.spring.java.controllers.IControllers;

@RestController
@RequestMapping(value = "/java-config")
public class ControllersImpl implements IControllers {

	@GetMapping(value = "/example")
	public String javaConfigExample() {
		return "Implemented using java config for servlet and application config using SPRING 4.3.9-RELEASE";
	}

}
