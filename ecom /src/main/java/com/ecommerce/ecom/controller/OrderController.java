package com.ecommerce.ecom.controller;

import com.ecommerce.ecom.dto.OrderDto;
import com.ecommerce.ecom.dto.ProductDto;
import com.ecommerce.ecom.service.OrderServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderServices orderServices;

    public OrderController(OrderServices orderServices){
        this.orderServices = orderServices;
    }

    @PostMapping(value = "/add")
    public Object addOrder(@RequestBody OrderDto orderDto){
        return OrderServices.addOrder(orderDto);
    }

    @GetMapping("/api/product")
    public Object fetchOrder(){
        return orderServices.fetchOrder();
    }

}
