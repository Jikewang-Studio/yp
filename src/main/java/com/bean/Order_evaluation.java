package com.bean;

import java.util.Date;

public class Order_evaluation {
    private Long orderEvaluationId;

    private String orderEvaluationContent;

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