package com.example.jenkinsspringboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class JenkinsSpringbootApplicationTests {
    public static Logger logger= LoggerFactory.getLogger((JenkinsSpringbootApplicationTests.class));

    @Test
    void contextLoads() {
        logger.info("Test case executing.....");
        logger.info("Test case executing second log statement.....");
        logger.info("Test case executing third log statement.....");
        logger.info("Test case executing fourth log statement.....");

        assertEquals(true,true);
    }

}
