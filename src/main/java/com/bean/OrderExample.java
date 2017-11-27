package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdIsNull() {
            addCriterion("photographer_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdIsNotNull() {
            addCriterion("photographer_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdEqualTo(Long value) {
            addCriterion("photographer_id =", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdNotEqualTo(Long value) {
            addCriterion("photographer_id <>", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdGreaterThan(Long value) {
            addCriterion("photographer_id >", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("photographer_id >=", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdLessThan(Long value) {
            addCriterion("photographer_id <", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdLessThanOrEqualTo(Long value) {
            addCriterion("photographer_id <=", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdIn(List<Long> values) {
            addCriterion("photographer_id in", values, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdNotIn(List<Long> values) {
            addCriterion("photographer_id not in", values, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdBetween(Long value1, Long value2) {
            addCriterion("photographer_id between", value1, value2, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdNotBetween(Long value1, Long value2) {
            addCriterion("photographer_id not between", value1, value2, "photographerId");
            return (Criteria) this;
        }

        public Criteria andOrderCreatIsNull() {
            addCriterion("order_creat is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatIsNotNull() {
            addCriterion("order_creat is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatEqualTo(Date value) {
            addCriterion("order_creat =", value, "orderCreat");
            return (Criteria) this;
        }

        public Criteria andOrderCreatNotEqualTo(Date value) {
            addCriterion("order_creat <>", value, "orderCreat");
            return (Criteria) this;
        }

        public Criteria andOrderCreatGreaterThan(Date value) {
            addCriterion("order_creat >", value, "orderCreat");
            return (Criteria) this;
        }

        public Criteria andOrderCreatGreaterThanOrEqualTo(Date value) {
            addCriterion("order_creat >=", value, "orderCreat");
            return (Criteria) this;
        }

        public Criteria andOrderCreatLessThan(Date value) {
            addCriterion("order_creat <", value, "orderCreat");
            return (Criteria) this;
        }

        public Criteria andOrderCreatLessThanOrEqualTo(Date value) {
            addCriterion("order_creat <=", value, "orderCreat");
            return (Criteria) this;
        }

        public Criteria andOrderCreatIn(List<Date> values) {
            addCriterion("order_creat in", values, "orderCreat");
            return (Criteria) this;
        }

        public Criteria andOrderCreatNotIn(List<Date> values) {
            addCriterion("order_creat not in", values, "orderCreat");
            return (Criteria) this;
        }

        public Criteria andOrderCreatBetween(Date value1, Date value2) {
            addCriterion("order_creat between", value1, value2, "orderCreat");
            return (Criteria) this;
        }

        public Criteria andOrderCreatNotBetween(Date value1, Date value2) {
            addCriterion("order_creat not between", value1, value2, "orderCreat");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdIsNull() {
            addCriterion("order_details_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdIsNotNull() {
            addCriterion("order_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdEqualTo(Long value) {
            addCriterion("order_details_id =", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdNotEqualTo(Long value) {
            addCriterion("order_details_id <>", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdGreaterThan(Long value) {
            addCriterion("order_details_id >", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_details_id >=", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdLessThan(Long value) {
            addCriterion("order_details_id <", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdLessThanOrEqualTo(Long value) {
            addCriterion("order_details_id <=", value, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdIn(List<Long> values) {
            addCriterion("order_details_id in", values, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdNotIn(List<Long> values) {
            addCriterion("order_details_id not in", values, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdBetween(Long value1, Long value2) {
            addCriterion("order_details_id between", value1, value2, "orderDetailsId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailsIdNotBetween(Long value1, Long value2) {
            addCriterion("order_details_id not between", value1, value2, "orderDetailsId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}