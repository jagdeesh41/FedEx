package com.example.searchrestapi.controller;

import com.example.searchrestapi.entity.Order;
import com.example.searchrestapi.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController
{
    @Autowired
    private OrderService orderService;
    @GetMapping("/getorder/{id}")
    public ResponseEntity<Order>getOrderById(@PathVariable long id)
    {
        Order order=orderService.getOrderById(id);

        return ResponseEntity.ok(order);



    }

}
