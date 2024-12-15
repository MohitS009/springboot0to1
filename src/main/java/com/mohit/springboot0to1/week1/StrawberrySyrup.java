package com.mohit.springboot0to1.week1;

import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup{
    @Override
    public String getSyrupType() {
        return "Strawberry Syrup.";
    }
}
