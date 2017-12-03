package com.bean;

import java.util.Date;

public class Order {
    //订单表ID
    private Long orderId;

    //用户ID
    private Long userId;

    //摄影师ID
    private Long photographerId;

    //订单创建时间
    private Date orderCreat;

    //订单详情ID
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