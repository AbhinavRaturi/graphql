package com.ardev.graphql.controller;

import com.ardev.graphql.entity.Order;
import com.ardev.graphql.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @MutationMapping(name = "createOrder")
    public Order createOrder(@Argument(name = "orderName") String orderName, @Argument(name = "orderDesc") String orderDesc, @Argument(name = "personId") String personId) {
        return orderService.addOrder(orderName, orderDesc, personId);
    }

    @QueryMapping(name = "getOrders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrder();
    }
}
