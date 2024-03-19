package com.example.searchrestapi.service;

import com.example.searchrestapi.entity.Order;

public interface OrderService {
    Order getOrderById(long id);
}
