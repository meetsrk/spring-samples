package com.songa.ravi.spring.java.controllers.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.songa.ravi.spring.java.controllers.ILogging;
import com.songa.ravi.spring.java.models.Student;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;

@RestController
@RequestMapping(value = "/logging")
public class LoggingImpl implements ILogging {

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	@GetMapping(value = "/sample")
	public Student sampleLogging(@ModelAttribute("Student") Student studentHeaders) {

		LOG.debug("DEBUG logging enabled: Headers ==> name:{}, age:{}, id:{}", studentHeaders.getName(),
				studentHeaders.getAge(), studentHeaders.getId());
		LOG.error("ERROR logging enabled: Headers ==> name:{}, age:{}, id:{}", studentHeaders.getName(),
				studentHeaders.getAge(), studentHeaders.getId());

		Student student = new Student(studentHeaders.getId(), studentHeaders.getName());
		return student;

	}

	@GetMapping(value = "/changeLogLevel/{logLevel}")
	public Student changeLogging(@ModelAttribute("Student") Student studentHeaders,
			@PathVariable("logLevel") String logLevel) {

		LOG.error("<==== ERROR MESSAGE ====>");
		LOG.debug("<==== DEBUG MESSAGE ====>");
		LOG.warn("<==== DEBUG MESSAGE ====>");
		LOG.info("<==== DEBUG MESSAGE ====>");
		LOG.trace("<==== DEBUG MESSAGE ====>");

		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		// lc.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME).setLevel(Level.DEBUG);
		// lc.getLogger(this.getClass()).setLevel(Level.DEBUG);
		List<ch.qos.logback.classic.Logger> loggerList = lc.getLoggerList();

		loggerList.stream().forEach(tmpLogger -> setLogLevel(tmpLogger, logLevel));

		// ch.qos.logback.classic.Logger root = lc.getLogger(Logger.ROOT_LOGGER_NAME);
		// root.setLevel(Level.DEBUG);

		// if (logLevel.equalsIgnoreCase("DEBUG")) {
		// lc.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME).setLevel(Level.DEBUG);
		// } else if (logLevel.equalsIgnoreCase("ERROR")) {
		// lc.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME).setLevel(Level.ERROR);
		// } else if (logLevel.equalsIgnoreCase("WARN")) {
		// lc.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME).setLevel(Level.WARN);
		// } else if (logLevel.equalsIgnoreCase("INFO")) {
		// lc.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME).setLevel(Level.INFO);
		// } else if (logLevel.equalsIgnoreCase("TRACE")) {
		// lc.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME).setLevel(Level.TRACE);
		// }


		Student student = new Student(studentHeaders.getId(), studentHeaders.getName());
		return student;

	}

	private void setLogLevel(ch.qos.logback.classic.Logger tmpLogger, String logLevel) {
		if (logLevel.equalsIgnoreCase("DEBUG")) {
			tmpLogger.setLevel(Level.DEBUG);
		} else if (logLevel.equalsIgnoreCase("ERROR")) {
			tmpLogger.setLevel(Level.ERROR);
		} else if (logLevel.equalsIgnoreCase("WARN")) {
			tmpLogger.setLevel(Level.WARN);
		} else if (logLevel.equalsIgnoreCase("INFO")) {
			tmpLogger.setLevel(Level.INFO);
		} else if (logLevel.equalsIgnoreCase("TRACE")) {
			tmpLogger.setLevel(Level.TRACE);
		}
	}

}
