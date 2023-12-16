package com.ecommerce.ecom.controller;
import com.ecommerce.ecom.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.ecom.service.OrderItemServices;
import java.util.List;
import java.util.Optional;

@RequestMapping("/api/order-items")
public class OrderItemController {
    private final OrderItemServices orderItemService;

    @Autowired
    public OrderItemController(OrderItemServices orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }
    @GetMapping("/get/{id}")
    public Object GetOrderItemById(@PathVariable Long id)
    {return orderItemService.getOrderItemById(id);}

    @PostMapping
    public ResponseEntity<OrderItem> createOrderItem(@RequestBody OrderItem orderItem) {
        OrderItem createdOrderItem = orderItemService.createOrderItem(orderItem);
        return new ResponseEntity<>(createdOrderItem, HttpStatus.CREATED);
    }

}
