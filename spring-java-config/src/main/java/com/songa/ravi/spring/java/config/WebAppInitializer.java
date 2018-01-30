//package com.songa.ravi.spring.java.config;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//public class WebAppInitializer implements WebApplicationInitializer {
//
//	public void onStartup(ServletContext servletContext) throws ServletException {
//
//		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//		ctx.register(AppConfig.class);
//		ctx.setServletContext(servletContext);
//		
//		ServletRegistration.Dynamic servlet = servletContext.addServlet("app-config", new DispatcherServlet(ctx));
//		servlet.setLoadOnStartup(1);
//		servlet.addMapping("/rest/*");
//		
//	
//		
//	}
//
//}
