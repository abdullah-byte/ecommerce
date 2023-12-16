package com.ecommerce.ecom.dto;


public class OrderItemDto {

    private Long id;


    private String order;

    private String product;

    private int quantity;

    private Double subtotal;

    public OrderItemDto(){

    }

    public OrderItemDto(Long id, String order, String product, int quantity, Double subtotal) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "OrderItemDto{" +
                "id=" + id +
                ", order='" + order + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", subtotal=" + subtotal +
                '}';
    }
}