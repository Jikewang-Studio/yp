package com.bean;

public class Order_details {
    private Long orderDetailsId;

    private String orderStatus;

    private Double orderPrice;

    private Integer orderQuantity;

    private Long orderEvaluationId;

    public Long getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(Long orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Long getOrderEvaluationId() {
        return orderEvaluationId;
    }

    public void setOrderEvaluationId(Long orderEvaluationId) {
        this.orderEvaluationId = orderEvaluationId;
    }
}