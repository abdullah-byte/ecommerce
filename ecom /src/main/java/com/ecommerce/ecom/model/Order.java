package com.ecommerce.ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long CustomerId;
    private String OrderDate;
    private int TotalAmount;
    private String OrderItems;



    public Order(){

    }
    public Order(long customerId, String orderDate, int totalAmount, String orderItems) {
        CustomerId = customerId;
        OrderDate = orderDate;
        TotalAmount = totalAmount;
        OrderItems = orderItems;
    }

    public long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(long customerId) {
        CustomerId = customerId;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public int getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        TotalAmount = totalAmount;
    }

    public String getOrderItems() {
        return OrderItems;
    }

    public void setOrderItems(String orderItems) {
        OrderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "CustomerId=" + CustomerId +
                ", OrderDate='" + OrderDate + '\'' +
                ", TotalAmount=" + TotalAmount +
                ", OrderItems='" + OrderItems + '\'' +
                '}';
    }
}
