package com.bean;

import java.util.Date;

public class Order {
    private Long orderId;

    private Long userId;

    private Long photographerId;

    private Date orderCreat;

    private Long orderDetailsId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(Long photographerId) {
        this.photographerId = photographerId;
    }

    public Date getOrderCreat() {
        return orderCreat;
    }

    public void setOrderCreat(Date orderCreat) {
        this.orderCreat = orderCreat;
    }

    public Long getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(Long orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }
}