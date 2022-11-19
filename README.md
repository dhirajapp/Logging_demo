# Logging_demo

-> It is the process of storing application execution details into a file / console / database.

-> Logging is very important for every project for easy maintenence by understanding Runtime behaviour of our application..

-> Logging will help us in understanding application execution details and logging will help us in identifying exceptions occured in the application.

-> Using log message we can find root cause of the problem in our application / code.

-> To implement logging in our application we have several logging frameworks, they are below

			1) Log4J
			2) Log4J2
			3) LogBack
			4) Logstash
			5) SLF4J

-> Once logging completed, we can perform Log Monitoring to read log messages

-> Log Monitoring means reading log messages of log file.

-> To perform log monitoring we have several tools in the market.

			1) Putty / MobaXterm
			2) WinScp
			3) Kibana
			4) Splunk  (paid s/w)


=================
Logging Architecture
==================

1) Logger

2) Layout

3) Appender


-> Logger is a class which is providing methods to generate log messages

			Logger logger  =  LoggerFactory.getLogger(UserService.class);
			
			logger.debug ("this is debug msg");

			logger.info("this is info msg");
		
			logger.warn("this is warn msg");

			logger.error("this is error msg");

-> Layout represents pattern of the log message (what info should be included in log message)

-> Appender is used to store log messages in destination ( console / file / database )


==========
Log Levels
===========

-> In logging we have several log levels to represent priority of log message

1) TRACE
2) DEBUG
3) INFO
4) WARN
5) ERROR
6) FATAL

		TRACE  > DEBUG  > INFO  > WARN  > ERROR > FATAL

Note: In Spring Boot application, the default LOG LEVEL  is INFO.

Note: When we set LOG level, from that level all the next levels logs also will be printed.


Ex:

-> If we set level as INFO, except TRACE & DEBUG every level will be printed.

-> If we set level as WARN, then TRACE, DEBUG and INFO will not be printed.

-> If we set level as ERROR, then ERROR and FATAL will be printed.
