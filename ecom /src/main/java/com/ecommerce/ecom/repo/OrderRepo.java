package com.ecommerce.ecom.repo;

import com.ecommerce.ecom.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
