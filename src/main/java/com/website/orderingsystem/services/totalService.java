package com.website.orderingsystem.services;

import com.website.orderingsystem.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class totalService {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ShippingService shippingService;


    public double orderTotal(Order order) {
        return orderService.calculateDiscount(order.getBasic(), order.getDiscount())
                - shippingService.freightCost(order.getBasic());

    }

}
