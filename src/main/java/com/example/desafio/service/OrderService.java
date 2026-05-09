package com.example.desafio.service;


import com.example.desafio.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double total(Order order){

        // 150 * 0.2
        return (order.getBasic() - (order.getBasic() * (order.getDiscount() / 100.00)))
                + shippingService.shipment(order);
    }
}
