package com.example.springbootapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Autowired
    private Environment env;

    public String GetAppName() {
        return env.getProperty("app.name");
    }

    public String GetAppDesc() {
        return env.getProperty("app.description");
    }

    @Value("${app.name}")
    private String appNameByValue;

    @Value("${app.description}")
    private String appDescByValue;

    public String getAppNameByValue() {
        return appNameByValue;
    }

    public String getAppDescByValue() {
        return appDescByValue;
    }
}