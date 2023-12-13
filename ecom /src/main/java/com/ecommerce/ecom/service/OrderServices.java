package com.ecommerce.ecom.service;

import com.ecommerce.ecom.dto.OrderDto;
import com.ecommerce.ecom.model.Order;
import com.ecommerce.ecom.repo.OrderRepo;
import org.springframework.stereotype.Service;

@Service
public class OrderServices {
    private final OrderRepo orderRepo;

    public OrderServices(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }
    public Object addOrder(OrderDto orderDto){
        Order order = new Order();
        order.setOrderItems(orderDto.getOrderItems());
        order.setOrderDate(orderDto.getOrderDate());
        order.setTotalAmount(orderDto.getTotalAmount());
        return orderRepo.save(order);

    }
    public Object fetchOrder(){
        return orderRepo.findAll();
    }

}
