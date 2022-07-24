package com.mahender.webapp.docker.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
@RestController
public class DockerdemoApplication {

	private static final Logger logger = LogManager.getLogger(DockerdemoApplication.class);

	@RequestMapping("/")
	public String home() {
		logger.info("Home called");
        return "Hello Docker World";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerdemoApplication.class, args);
	}

}
