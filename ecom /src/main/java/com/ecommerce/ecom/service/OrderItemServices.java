package com.ecommerce.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.ecom.model.OrderItem;
import com.ecommerce.ecom.repo.OrderItemRepo;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemServices {
    private final OrderItemRepo orderItemRepo;

    @Autowired
    public OrderItemServices(OrderItemRepo orderItemRepo) {
        this.orderItemRepo = orderItemRepo;
    }

    public List<OrderItem> getAllOrderItems() {
        return orderItemRepo.findAll();
    }



    public Optional<OrderItem> getOrderItemById(Long orderId) {
        return orderItemRepo.findById(orderId);
    }

    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepo.save(orderItem);
    }

}
