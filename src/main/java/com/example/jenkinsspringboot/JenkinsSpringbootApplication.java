package com.example.jenkinsspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsSpringbootApplication {


    public static Logger logger= LoggerFactory.getLogger(JenkinsSpringbootApplication.class);

    @PostConstruct
    public void intt(){
        logger.info("Application Started...");
    }

    public static void main(String[] args) {
        logger.info("Application Executed");
        SpringApplication.run(JenkinsSpringbootApplication.class, args);
    }
}
