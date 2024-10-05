package com.ardev.graphql.service;

import com.ardev.graphql.Enums.Status;
import com.ardev.graphql.entity.Order;
import com.ardev.graphql.entity.Person;
import com.ardev.graphql.repository.OrderRepository;
import com.ardev.graphql.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final PersonRepository personRepository;
    
    public Order addOrder(String orderName, String orderDesc, String personId){
        Person person = personRepository.findById(Long.valueOf(personId)).orElse(null);
        Order order = new Order();
        if(person != null){
            order.setOrderName(orderName);
            order.setOrderDesc(orderDesc);
            order.setPerson(person);
            order.setStatus(Status.ORDER_PROCESSING);
        }
        return orderRepository.save(order);
    }

    // find all order Details
    public List<Order> getAllOrder (){
        return orderRepository.findAll();
    }

    // Get a specific order info
    public Order getOrderById(Long orderId){
        return orderRepository
                .findById(orderId)
                .orElseThrow(()-> new NoSuchElementException("Order not found"));
    }
}
