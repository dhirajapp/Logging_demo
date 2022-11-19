package com.dhirajapp.services;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

//import ch.qos.logback.classic.Logger;

public class MessageService {
	
	private static final Logger logger = LoggerFactory.getLogger(MessageService.class);
	public String getWelcomeMsg() {
		logger.debug("getWelcomeMsg() - method start");
		String msg="Welcome Dhiraj Kumar";
		
		logger.debug("getWelcomeMsg() - method end");
		return msg;
	}

	
	public String getGreetMsg() {
		logger.debug("getGreetMsg() - method start");
		
		String msg="Good Morning ..!";
		logger.debug("getGreetMsg() - method end");
		return msg;
	}
	
}
