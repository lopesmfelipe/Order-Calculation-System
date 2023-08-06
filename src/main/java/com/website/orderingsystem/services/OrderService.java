package com.website.orderingsystem.services;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public double calculateDiscount(double basicValue, double discount) {
        double discountPercentage = discount / 100;
        double discountAmount = basicValue * discountPercentage;
        return basicValue - discountAmount;
    }
}
