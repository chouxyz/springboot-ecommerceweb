package com.chou.springbootecommerceweb.service;

import com.chou.springbootecommerceweb.dto.CreateOrderRequest;
import com.chou.springbootecommerceweb.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
