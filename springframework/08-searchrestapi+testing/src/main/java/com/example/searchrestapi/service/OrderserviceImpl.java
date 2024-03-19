package com.example.searchrestapi.service;

import com.example.searchrestapi.entity.Order;
import com.example.searchrestapi.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderserviceImpl implements OrderService
{
    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order getOrderById(long id)
    {
        Order order=orderRepository.findById(id).get();
        return order;
    }
}
