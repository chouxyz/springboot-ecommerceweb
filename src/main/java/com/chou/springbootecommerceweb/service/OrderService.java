package com.chou.springbootecommerceweb.service;

import com.chou.springbootecommerceweb.dto.CreateOrderRequest;

public interface OrderService {

    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
