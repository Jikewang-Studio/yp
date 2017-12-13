package com.bean;

import java.util.Date;

public class Order_evaluation {
    //订单评价表Id
    private Long orderEvaluationId;

    //订单评价内容
    private String orderEvaluationContent;

    //订单评价时间
    private Date orderEvaluationCreate;

    public Long getOrderEvaluationId() {
        return orderEvaluationId;
    }

    public void setOrderEvaluationId(Long orderEvaluationId) {
        this.orderEvaluationId = orderEvaluationId;
    }

    public String getOrderEvaluationContent() {
        return orderEvaluationContent;
    }

    public void setOrderEvaluationContent(String orderEvaluationContent) {
        this.orderEvaluationContent = orderEvaluationContent == null ? null : orderEvaluationContent.trim();
    }

    public Date getOrderEvaluationCreate() {
        return orderEvaluationCreate;
    }

    public void setOrderEvaluationCreate(Date orderEvaluationCreate) {
        this.orderEvaluationCreate = orderEvaluationCreate;
    }
}