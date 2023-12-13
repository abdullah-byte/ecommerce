package com.ecommerce.ecom.dto;

public class OrderDto {
    private long CustomerId;
    private String OrderDate;
    private int TotalAmount;
    private String OrderItems;

    public OrderDto(){

    }
    public OrderDto(long customerId, String orderDate, int totalAmount, String orderItems) {
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
        return "OrderDto{" +
                "CustomerId=" + CustomerId +
                ", OrderDate='" + OrderDate + '\'' +
                ", TotalAmount=" + TotalAmount +
                ", OrderItems='" + OrderItems + '\'' +
                '}';
    }
}
