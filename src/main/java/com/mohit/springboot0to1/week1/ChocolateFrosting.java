package com.mohit.springboot0to1.week1;

import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Chocolate Frosting.";
    }
}
