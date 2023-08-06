package com.website.orderingsystem.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double freightCost(double basicValue){
        if (basicValue < 100){
            return 20;
        } else if (basicValue >= 100 && basicValue <= 200) {
            return 12;
        } else {
            return 0;
        }
    }

}
