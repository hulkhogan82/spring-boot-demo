package com.api.springdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote{
    private String type;
    private Value value;
    //Testing environment
    private String appName;
    private String appDesc;
    //Testing environment by Value
    private String appNameByValue;
    private String appDescByValue;

    public Quote(){}

    public String getType(){
        return type;
    }

    public void setType (String type){
        this.type = type;
    }

    public Value getValue(){
        return value;
    }
    public void setValue(Value value){
        this.value = value;
    }

    public String getAppName(){
        return appName;
    }

    public void setAppName (String type){
        this.appName = type;
    }

    public String getAppDesc(){
        return appDesc;
    }

    public void setAppDesc (String type){
        this.appDesc = type;
    }

    public String getAppNameByValue(){
        return appNameByValue;
    }
    public void setAppNameByValue(String value){
        this.appNameByValue = value;
    }

    public String getAppDescByValue(){
        return appDescByValue;
    }
    public void setAppDescByValue(String value){
        this.appDescByValue = value;
    }

    @Override
    public String toString(){
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }

}