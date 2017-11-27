package com.bean;

import java.util.ArrayList;
import java.util.List;

public class AdministratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministratorExample() {
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

        public Criteria andAdministratorIdIsNull() {
            addCriterion("administrator_id is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdIsNotNull() {
            addCriterion("administrator_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdEqualTo(Integer value) {
            addCriterion("administrator_id =", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdNotEqualTo(Integer value) {
            addCriterion("administrator_id <>", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdGreaterThan(Integer value) {
            addCriterion("administrator_id >", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("administrator_id >=", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdLessThan(Integer value) {
            addCriterion("administrator_id <", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdLessThanOrEqualTo(Integer value) {
            addCriterion("administrator_id <=", value, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdIn(List<Integer> values) {
            addCriterion("administrator_id in", values, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdNotIn(List<Integer> values) {
            addCriterion("administrator_id not in", values, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdBetween(Integer value1, Integer value2) {
            addCriterion("administrator_id between", value1, value2, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("administrator_id not between", value1, value2, "administratorId");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameIsNull() {
            addCriterion("administrator_name is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameIsNotNull() {
            addCriterion("administrator_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameEqualTo(String value) {
            addCriterion("administrator_name =", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotEqualTo(String value) {
            addCriterion("administrator_name <>", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameGreaterThan(String value) {
            addCriterion("administrator_name >", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameGreaterThanOrEqualTo(String value) {
            addCriterion("administrator_name >=", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameLessThan(String value) {
            addCriterion("administrator_name <", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameLessThanOrEqualTo(String value) {
            addCriterion("administrator_name <=", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameLike(String value) {
            addCriterion("administrator_name like", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotLike(String value) {
            addCriterion("administrator_name not like", value, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameIn(List<String> values) {
            addCriterion("administrator_name in", values, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotIn(List<String> values) {
            addCriterion("administrator_name not in", values, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameBetween(String value1, String value2) {
            addCriterion("administrator_name between", value1, value2, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorNameNotBetween(String value1, String value2) {
            addCriterion("administrator_name not between", value1, value2, "administratorName");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordIsNull() {
            addCriterion("administrator_password is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordIsNotNull() {
            addCriterion("administrator_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordEqualTo(String value) {
            addCriterion("administrator_password =", value, "administratorPassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordNotEqualTo(String value) {
            addCriterion("administrator_password <>", value, "administratorPassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordGreaterThan(String value) {
            addCriterion("administrator_password >", value, "administratorPassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("administrator_password >=", value, "administratorPassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordLessThan(String value) {
            addCriterion("administrator_password <", value, "administratorPassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordLessThanOrEqualTo(String value) {
            addCriterion("administrator_password <=", value, "administratorPassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordLike(String value) {
            addCriterion("administrator_password like", value, "administratorPassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordNotLike(String value) {
            addCriterion("administrator_password not like", value, "administratorPassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordIn(List<String> values) {
            addCriterion("administrator_password in", values, "administratorPassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordNotIn(List<String> values) {
            addCriterion("administrator_password not in", values, "administratorPassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordBetween(String value1, String value2) {
            addCriterion("administrator_password between", value1, value2, "administratorPassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorPasswordNotBetween(String value1, String value2) {
            addCriterion("administrator_password not between", value1, value2, "administratorPassword");
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