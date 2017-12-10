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

        public Criteria andAttentionIdEqualTo(Integer value) {
            addCriterion("attention_id =", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdNotEqualTo(Integer value) {
            addCriterion("attention_id <>", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdGreaterThan(Integer value) {
            addCriterion("attention_id >", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attention_id >=", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdLessThan(Integer value) {
            addCriterion("attention_id <", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdLessThanOrEqualTo(Integer value) {
            addCriterion("attention_id <=", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdIn(List<Integer> values) {
            addCriterion("attention_id in", values, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdNotIn(List<Integer> values) {
            addCriterion("attention_id not in", values, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdBetween(Integer value1, Integer value2) {
            addCriterion("attention_id between", value1, value2, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andUerIdEqualTo(Integer value) {
            addCriterion("uer_id =", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdNotEqualTo(Integer value) {
            addCriterion("uer_id <>", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdGreaterThan(Integer value) {
            addCriterion("uer_id >", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uer_id >=", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdLessThan(Integer value) {
            addCriterion("uer_id <", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdLessThanOrEqualTo(Integer value) {
            addCriterion("uer_id <=", value, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdIn(List<Integer> values) {
            addCriterion("uer_id in", values, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdNotIn(List<Integer> values) {
            addCriterion("uer_id not in", values, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdBetween(Integer value1, Integer value2) {
            addCriterion("uer_id between", value1, value2, "uerId");
            return (Criteria) this;
        }

        public Criteria andUerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uer_id not between", value1, value2, "uerId");
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

        public Criteria andPhotographerIdEqualTo(Integer value) {
            addCriterion("photographer_id =", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdNotEqualTo(Integer value) {
            addCriterion("photographer_id <>", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdGreaterThan(Integer value) {
            addCriterion("photographer_id >", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("photographer_id >=", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdLessThan(Integer value) {
            addCriterion("photographer_id <", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdLessThanOrEqualTo(Integer value) {
            addCriterion("photographer_id <=", value, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdIn(List<Integer> values) {
            addCriterion("photographer_id in", values, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdNotIn(List<Integer> values) {
            addCriterion("photographer_id not in", values, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdBetween(Integer value1, Integer value2) {
            addCriterion("photographer_id between", value1, value2, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("photographer_id not between", value1, value2, "photographerId");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameIsNull() {
            addCriterion("photographer_name is null");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameIsNotNull() {
            addCriterion("photographer_name is not null");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameEqualTo(String value) {
            addCriterion("photographer_name =", value, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameNotEqualTo(String value) {
            addCriterion("photographer_name <>", value, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameGreaterThan(String value) {
            addCriterion("photographer_name >", value, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameGreaterThanOrEqualTo(String value) {
            addCriterion("photographer_name >=", value, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameLessThan(String value) {
            addCriterion("photographer_name <", value, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameLessThanOrEqualTo(String value) {
            addCriterion("photographer_name <=", value, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameLike(String value) {
            addCriterion("photographer_name like", value, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameNotLike(String value) {
            addCriterion("photographer_name not like", value, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameIn(List<String> values) {
            addCriterion("photographer_name in", values, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameNotIn(List<String> values) {
            addCriterion("photographer_name not in", values, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameBetween(String value1, String value2) {
            addCriterion("photographer_name between", value1, value2, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerNameNotBetween(String value1, String value2) {
            addCriterion("photographer_name not between", value1, value2, "photographerName");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlIsNull() {
            addCriterion("photographer_img_url is null");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlIsNotNull() {
            addCriterion("photographer_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlEqualTo(String value) {
            addCriterion("photographer_img_url =", value, "photographerImgUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlNotEqualTo(String value) {
            addCriterion("photographer_img_url <>", value, "photographerImgUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlGreaterThan(String value) {
            addCriterion("photographer_img_url >", value, "photographerImgUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("photographer_img_url >=", value, "photographerImgUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlLessThan(String value) {
            addCriterion("photographer_img_url <", value, "photographerImgUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlLessThanOrEqualTo(String value) {
            addCriterion("photographer_img_url <=", value, "photographerImgUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlLike(String value) {
            addCriterion("photographer_img_url like", value, "photographerImgUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlNotLike(String value) {
            addCriterion("photographer_img_url not like", value, "photographerImgUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlIn(List<String> values) {
            addCriterion("photographer_img_url in", values, "photographerImgUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlNotIn(List<String> values) {
            addCriterion("photographer_img_url not in", values, "photographerImgUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlBetween(String value1, String value2) {
            addCriterion("photographer_img_url between", value1, value2, "photographerImgUrl");
            return (Criteria) this;
        }

        public Criteria andPhotographerImgUrlNotBetween(String value1, String value2) {
            addCriterion("photographer_img_url not between", value1, value2, "photographerImgUrl");
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