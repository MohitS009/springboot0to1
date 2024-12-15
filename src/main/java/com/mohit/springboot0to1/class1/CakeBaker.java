package com.mohit.springboot0to1.class1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(@Qualifier("chocolateFrosting") Frosting frosting, @Qualifier("chocolateSyrup") Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public String bakeCake(){
       String frostingType = frosting.getFrostingType();
       String syrupType = syrup.getSyrupType();

        return "Baking cake, Flavour is "+frostingType+" and topping used " +syrupType;
    }
}
