package com.api.springdemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final Logger logger = LoggerFactory.getLogger(DataInitializer.class);
    
    public void initData() {
        try {

           // logic to initialize data

        } catch (final Exception ex) {
            logger.error("Exception while inserting mock data {}", ex);
        }
    }
}