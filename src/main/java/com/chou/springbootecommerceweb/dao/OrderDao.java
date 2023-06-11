package com.chou.springbootecommerceweb.dao;

import com.chou.springbootecommerceweb.dto.OrderQueryParams;
import com.chou.springbootecommerceweb.model.Order;
import com.chou.springbootecommerceweb.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
