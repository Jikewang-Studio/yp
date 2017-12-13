package com.bean;

public class Order_details {
    //订单详情表ID
    private Long orderDetailsId;

    //0;表示已经处理；1表示未处理
    private Integer orderStatus;

    //订单价格
    private Double orderPrice;

    //订单数量
    private Integer orderQuantity;

    //订单评价ID
    private Long orderEvaluationId;

    public Long getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(Long orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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