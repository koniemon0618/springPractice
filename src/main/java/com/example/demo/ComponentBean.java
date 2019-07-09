package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ComponentBean {
    public Integer intval = 9;
 
    public Integer getIntval() {
        return intval;
    }
 
    public void setIntval(Integer intval) {
        this.intval = intval;
    }
}