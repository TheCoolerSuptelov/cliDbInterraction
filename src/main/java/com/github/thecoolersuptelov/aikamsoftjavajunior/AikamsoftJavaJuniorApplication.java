package com.github.thecoolersuptelov.aikamsoftjavajunior;

import com.github.thecoolersuptelov.aikamsoftjavajunior.Services.CliActions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class AikamsoftJavaJuniorApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AikamsoftJavaJuniorApplication.class);
    @Autowired
    private Map<String, CliActions> actionsMap;

    public static void main(String[] args) {
        SpringApplication.run(AikamsoftJavaJuniorApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < args.length; i++) {
            logger.info(args[i]);
        }
        actionsMap.get(args[0]).prepareAnswer();
    }
}
