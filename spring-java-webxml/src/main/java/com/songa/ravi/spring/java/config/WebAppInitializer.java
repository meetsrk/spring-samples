package com.songa.ravi.spring.java.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements  WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		XmlWebApplicationContext ctx = new XmlWebApplicationContext();
		
		ctx.setConfigLocation("/WEB-INF/application-context-servlet.xml");
		
		ServletRegistration.Dynamic servlet = servletContext
		          .addServlet("application-context", new DispatcherServlet(ctx));
		
		servlet.setLoadOnStartup(1);
        
		servlet.addMapping("/rest/*");

	}

}
