package com.micron;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients( basePackages = "com.micron.client")
public class MicronApplication {

	public static Logger logger = LoggerFactory.getLogger(MicronApplication.class);

	public static void main(String[] args) {
		logger.info("Micron application started...");
		// Different way to set te context path of SpringBoot application
		// System.setProperty("server.servlet.context-path", "/micron");
		SpringApplication.run(MicronApplication.class, args);
	}

}
