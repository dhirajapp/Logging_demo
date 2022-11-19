package com.dhirajapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dhirajapp.dao.ReportDao;
import com.dhirajapp.services.MessageService;

@SpringBootApplication
public class LoggingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingAppApplication.class, args);
		
		
		// calling service class methods
				MessageService service = new MessageService();
				service.getWelcomeMsg();
				service.getGreetMsg();

				// calling dao class method
				
				ReportDao dao = new ReportDao();
				dao.getName(101);
	}

}
