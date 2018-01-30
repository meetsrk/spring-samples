package com.songa.ravi.spring.examples.webxml.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.songa.ravi.spring.examples.webxml.controllers.IControllers;

@RestController
@RequestMapping(value = "/controllers")
public class ControllersImpl implements IControllers {

	@RequestMapping(value = "/webxml/example", method = RequestMethod.GET)
	public String webxmlExample() {
		return "Implemented webxml through SPRING 4.3.9.RELEASE";
	}

}
