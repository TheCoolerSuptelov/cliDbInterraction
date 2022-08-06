package com.github.thecoolersuptelov.aikamsoftjavajunior;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AikamsoftJavaJuniorApplication implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(AikamsoftJavaJuniorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AikamsoftJavaJuniorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < args.length; i++) {
			logger.info(args[i]);
		}
	}
}
