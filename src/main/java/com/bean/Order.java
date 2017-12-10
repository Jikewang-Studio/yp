package com.bean;

import java.util.Date;

public class Order {
    //订单表ID
    private Integer orderId;

    //用户ID
    private Integer userId;

    //摄影师ID
    private Integer photographerId;

    //订单创建时间
    private Date orderCreat;

    //订单详情ID
    private Integer orderDetailsId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(Integer photographerId) {
        this.photographerId = photographerId;
    }

    public Date getOrderCreat() {
        return orderCreat;
    }

    public void setOrderCreat(Date orderCreat) {
        this.orderCreat = orderCreat;
    }

    public Integer getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(Integer orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }
}