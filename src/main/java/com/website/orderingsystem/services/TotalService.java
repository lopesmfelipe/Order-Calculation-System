package com.website.orderingsystem.services;

import com.website.orderingsystem.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // REGISTER COMPONENTS
public class TotalService {

    @Autowired // DEPENDENCY INJECTION
    private OrderService orderService;

    @Autowired // DEPENDENCY INJECTION
    private ShippingService shippingService;

    public double orderTotal(Order order) {
        return orderService.calculateDiscount(order.getBasic(), order.getDiscount())
                + shippingService.freightCost(order.getBasic());

    }

}
