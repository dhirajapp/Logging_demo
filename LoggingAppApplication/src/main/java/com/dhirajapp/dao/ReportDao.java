package com.dhirajapp.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dhirajapp.services.MessageService;

public class ReportDao {
	
	private static final Logger logger = LoggerFactory.getLogger(ReportDao.class);
	
	public String getName(Integer id) {
		String name = null;
		logger.info("getName() - method start");
		if (id == 101) {
			name = "Dhiraj";
		} else if (id == 102) {
			name = "yasika";
		} else {
			name = "Invalid Id";
		}
		logger.info("getName() - method end");
		return name;
	}


}