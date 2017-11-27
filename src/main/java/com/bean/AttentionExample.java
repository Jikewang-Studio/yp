package com.bean;

import java.util.ArrayList;
import java.util.List;

public class AttentionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttentionExample() {
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

        public Criteria andAttentionIdIsNull() {
            addCriterion("attention_id is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIdIsNotNull() {
            addCriterion("attention_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionIdEqualTo(Long value) {
            addCriterion("attention_id =", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdNotEqualTo(Long value) {
            addCriterion("attention_id <>", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdGreaterThan(Long value) {
            addCriterion("attention_id >", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("attention_id >=", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdLessThan(Long value) {
            addCriterion("attention_id <", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdLessThanOrEqualTo(Long value) {
            addCriterion("attention_id <=", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdIn(List<Long> values) {
            addCriterion("attention_id in", values, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdNotIn(List<Long> values) {
            addCriterion("attention_id not in", values, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdBetween(Long value1, Long value2) {
            addCriterion("attention_id between", value1, value2, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdNotBetween(Long value1, Long value2) {
            addCriterion("attention_id not between", value1, value2, "attentionId");
            return (Criteria) this;
        }

        public Criteria andUerIdIsNull() {
            addCriterion("uer_id is null");
            return (Criteria) this;
        }

        public Criteria andUerIdIsNotNull() {
            addCriterion("uer_id is not null");
            return (Criteria) this;
        }

        public Criteria andUerIdEqualTo(String value) {
            addCriterion("uer_id =", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdNotEqualTo(String value) {
            addCriterion("uer_id <>", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdGreaterThan(String value) {
            addCriterion("uer_id >", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdGreaterThanOrEqualTo(String value) {
            addCriterion("uer_id >=", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdLessThan(String value) {
            addCriterion("uer_id <", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdLessThanOrEqualTo(String value) {
            addCriterion("uer_id <=", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdLike(String value) {
            addCriterion("uer_id like", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdNotLike(String value) {
            addCriterion("uer_id not like", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdIn(List<String> values) {
            addCriterion("uer_id in", values, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdNotIn(List<String> values) {
            addCriterion("uer_id not in", values, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdBetween(String value1, String value2) {
            addCriterion("uer_id between", value1, value2, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdNotBetween(String value1, String value2) {
            addCriterion("uer_id not between", value1, value2, "uerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdIsNull() {
            addCriterion("attention_photographer_id is null");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdIsNotNull() {
            addCriterion("attention_photographer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdEqualTo(String value) {
            addCriterion("attention_photographer_id =", value, "attentionPhotographerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdNotEqualTo(String value) {
            addCriterion("attention_photographer_id <>", value, "attentionPhotographerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdGreaterThan(String value) {
            addCriterion("attention_photographer_id >", value, "attentionPhotographerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdGreaterThanOrEqualTo(String value) {
            addCriterion("attention_photographer_id >=", value, "attentionPhotographerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdLessThan(String value) {
            addCriterion("attention_photographer_id <", value, "attentionPhotographerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdLessThanOrEqualTo(String value) {
            addCriterion("attention_photographer_id <=", value, "attentionPhotographerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdLike(String value) {
            addCriterion("attention_photographer_id like", value, "attentionPhotographerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdNotLike(String value) {
            addCriterion("attention_photographer_id not like", value, "attentionPhotographerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdIn(List<String> values) {
            addCriterion("attention_photographer_id in", values, "attentionPhotographerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdNotIn(List<String> values) {
            addCriterion("attention_photographer_id not in", values, "attentionPhotographerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdBetween(String value1, String value2) {
            addCriterion("attention_photographer_id between", value1, value2, "attentionPhotographerId");
            return (Criteria) this;
        }

        public Criteria andAttentionPhotographerIdNotBetween(String value1, String value2) {
            addCriterion("attention_photographer_id not between", value1, value2, "attentionPhotographerId");
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