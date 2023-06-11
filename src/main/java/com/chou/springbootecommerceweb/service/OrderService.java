package com.chou.springbootecommerceweb.service;

import com.chou.springbootecommerceweb.dto.CreateOrderRequest;
import com.chou.springbootecommerceweb.dto.OrderQueryParams;
import com.chou.springbootecommerceweb.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
