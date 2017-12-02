package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class P_to_u_messageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P_to_u_messageExample() {
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

        public Criteria andUserMessageIdIsNull() {
            addCriterion("user_message_id is null");
            return (Criteria) this;
        }

        public Criteria andUserMessageIdIsNotNull() {
            addCriterion("user_message_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserMessageIdEqualTo(Long value) {
            addCriterion("user_message_id =", value, "userMessageId");
            return (Criteria) this;
        }

        public Criteria andUserMessageIdNotEqualTo(Long value) {
            addCriterion("user_message_id <>", value, "userMessageId");
            return (Criteria) this;
        }

        public Criteria andUserMessageIdGreaterThan(Long value) {
            addCriterion("user_message_id >", value, "userMessageId");
            return (Criteria) this;
        }

        public Criteria andUserMessageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_message_id >=", value, "userMessageId");
            return (Criteria) this;
        }

        public Criteria andUserMessageIdLessThan(Long value) {
            addCriterion("user_message_id <", value, "userMessageId");
            return (Criteria) this;
        }

        public Criteria andUserMessageIdLessThanOrEqualTo(Long value) {
            addCriterion("user_message_id <=", value, "userMessageId");
            return (Criteria) this;
        }

        public Criteria andUserMessageIdIn(List<Long> values) {
            addCriterion("user_message_id in", values, "userMessageId");
            return (Criteria) this;
        }

        public Criteria andUserMessageIdNotIn(List<Long> values) {
            addCriterion("user_message_id not in", values, "userMessageId");
            return (Criteria) this;
        }

        public Criteria andUserMessageIdBetween(Long value1, Long value2) {
            addCriterion("user_message_id between", value1, value2, "userMessageId");
            return (Criteria) this;
        }

        public Criteria andUserMessageIdNotBetween(Long value1, Long value2) {
            addCriterion("user_message_id not between", value1, value2, "userMessageId");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentIsNull() {
            addCriterion("user_message_content is null");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentIsNotNull() {
            addCriterion("user_message_content is not null");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentEqualTo(String value) {
            addCriterion("user_message_content =", value, "userMessageContent");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentNotEqualTo(String value) {
            addCriterion("user_message_content <>", value, "userMessageContent");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentGreaterThan(String value) {
            addCriterion("user_message_content >", value, "userMessageContent");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("user_message_content >=", value, "userMessageContent");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentLessThan(String value) {
            addCriterion("user_message_content <", value, "userMessageContent");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentLessThanOrEqualTo(String value) {
            addCriterion("user_message_content <=", value, "userMessageContent");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentLike(String value) {
            addCriterion("user_message_content like", value, "userMessageContent");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentNotLike(String value) {
            addCriterion("user_message_content not like", value, "userMessageContent");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentIn(List<String> values) {
            addCriterion("user_message_content in", values, "userMessageContent");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentNotIn(List<String> values) {
            addCriterion("user_message_content not in", values, "userMessageContent");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentBetween(String value1, String value2) {
            addCriterion("user_message_content between", value1, value2, "userMessageContent");
            return (Criteria) this;
        }

        public Criteria andUserMessageContentNotBetween(String value1, String value2) {
            addCriterion("user_message_content not between", value1, value2, "userMessageContent");
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

        public Criteria andMessageCreateIsNull() {
            addCriterion("message_create is null");
            return (Criteria) this;
        }

        public Criteria andMessageCreateIsNotNull() {
            addCriterion("message_create is not null");
            return (Criteria) this;
        }

        public Criteria andMessageCreateEqualTo(Date value) {
            addCriterion("message_create =", value, "messageCreate");
            return (Criteria) this;
        }

        public Criteria andMessageCreateNotEqualTo(Date value) {
            addCriterion("message_create <>", value, "messageCreate");
            return (Criteria) this;
        }

        public Criteria andMessageCreateGreaterThan(Date value) {
            addCriterion("message_create >", value, "messageCreate");
            return (Criteria) this;
        }

        public Criteria andMessageCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("message_create >=", value, "messageCreate");
            return (Criteria) this;
        }

        public Criteria andMessageCreateLessThan(Date value) {
            addCriterion("message_create <", value, "messageCreate");
            return (Criteria) this;
        }

        public Criteria andMessageCreateLessThanOrEqualTo(Date value) {
            addCriterion("message_create <=", value, "messageCreate");
            return (Criteria) this;
        }

        public Criteria andMessageCreateIn(List<Date> values) {
            addCriterion("message_create in", values, "messageCreate");
            return (Criteria) this;
        }

        public Criteria andMessageCreateNotIn(List<Date> values) {
            addCriterion("message_create not in", values, "messageCreate");
            return (Criteria) this;
        }

        public Criteria andMessageCreateBetween(Date value1, Date value2) {
            addCriterion("message_create between", value1, value2, "messageCreate");
            return (Criteria) this;
        }

        public Criteria andMessageCreateNotBetween(Date value1, Date value2) {
            addCriterion("message_create not between", value1, value2, "messageCreate");
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