package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order_evaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Order_evaluationExample() {
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

        public Criteria andOrderEvaluationIdIsNull() {
            addCriterion("order_evaluation_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationIdIsNotNull() {
            addCriterion("order_evaluation_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationIdEqualTo(Long value) {
            addCriterion("order_evaluation_id =", value, "orderEvaluationId");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationIdNotEqualTo(Long value) {
            addCriterion("order_evaluation_id <>", value, "orderEvaluationId");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationIdGreaterThan(Long value) {
            addCriterion("order_evaluation_id >", value, "orderEvaluationId");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_evaluation_id >=", value, "orderEvaluationId");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationIdLessThan(Long value) {
            addCriterion("order_evaluation_id <", value, "orderEvaluationId");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationIdLessThanOrEqualTo(Long value) {
            addCriterion("order_evaluation_id <=", value, "orderEvaluationId");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationIdIn(List<Long> values) {
            addCriterion("order_evaluation_id in", values, "orderEvaluationId");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationIdNotIn(List<Long> values) {
            addCriterion("order_evaluation_id not in", values, "orderEvaluationId");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationIdBetween(Long value1, Long value2) {
            addCriterion("order_evaluation_id between", value1, value2, "orderEvaluationId");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationIdNotBetween(Long value1, Long value2) {
            addCriterion("order_evaluation_id not between", value1, value2, "orderEvaluationId");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentIsNull() {
            addCriterion("\"order_ evaluation_content\" is null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentIsNotNull() {
            addCriterion("\"order_ evaluation_content\" is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentEqualTo(String value) {
            addCriterion("\"order_ evaluation_content\" =", value, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentNotEqualTo(String value) {
            addCriterion("\"order_ evaluation_content\" <>", value, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentGreaterThan(String value) {
            addCriterion("\"order_ evaluation_content\" >", value, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentGreaterThanOrEqualTo(String value) {
            addCriterion("\"order_ evaluation_content\" >=", value, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentLessThan(String value) {
            addCriterion("\"order_ evaluation_content\" <", value, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentLessThanOrEqualTo(String value) {
            addCriterion("\"order_ evaluation_content\" <=", value, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentLike(String value) {
            addCriterion("\"order_ evaluation_content\" like", value, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentNotLike(String value) {
            addCriterion("\"order_ evaluation_content\" not like", value, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentIn(List<String> values) {
            addCriterion("\"order_ evaluation_content\" in", values, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentNotIn(List<String> values) {
            addCriterion("\"order_ evaluation_content\" not in", values, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentBetween(String value1, String value2) {
            addCriterion("\"order_ evaluation_content\" between", value1, value2, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationContentNotBetween(String value1, String value2) {
            addCriterion("\"order_ evaluation_content\" not between", value1, value2, "orderEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateIsNull() {
            addCriterion("\"order_ evaluation_create\" is null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateIsNotNull() {
            addCriterion("\"order_ evaluation_create\" is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateEqualTo(Date value) {
            addCriterion("\"order_ evaluation_create\" =", value, "orderEvaluationCreate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateNotEqualTo(Date value) {
            addCriterion("\"order_ evaluation_create\" <>", value, "orderEvaluationCreate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateGreaterThan(Date value) {
            addCriterion("\"order_ evaluation_create\" >", value, "orderEvaluationCreate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("\"order_ evaluation_create\" >=", value, "orderEvaluationCreate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateLessThan(Date value) {
            addCriterion("\"order_ evaluation_create\" <", value, "orderEvaluationCreate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateLessThanOrEqualTo(Date value) {
            addCriterion("\"order_ evaluation_create\" <=", value, "orderEvaluationCreate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateIn(List<Date> values) {
            addCriterion("\"order_ evaluation_create\" in", values, "orderEvaluationCreate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateNotIn(List<Date> values) {
            addCriterion("\"order_ evaluation_create\" not in", values, "orderEvaluationCreate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateBetween(Date value1, Date value2) {
            addCriterion("\"order_ evaluation_create\" between", value1, value2, "orderEvaluationCreate");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationCreateNotBetween(Date value1, Date value2) {
            addCriterion("\"order_ evaluation_create\" not between", value1, value2, "orderEvaluationCreate");
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