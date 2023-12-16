package com.ecommerce.ecom.repo;
import com.ecommerce.ecom.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long>{
}
