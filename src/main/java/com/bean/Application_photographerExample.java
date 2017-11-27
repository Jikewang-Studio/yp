package com.bean;

import java.util.ArrayList;
import java.util.List;

public class Application_photographerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Application_photographerExample() {
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

        public Criteria andApplicationFormIdIsNull() {
            addCriterion("application_form_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationFormIdIsNotNull() {
            addCriterion("application_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationFormIdEqualTo(Long value) {
            addCriterion("application_form_id =", value, "applicationFormId");
            return (Criteria) this;
        }

        public Criteria andApplicationFormIdNotEqualTo(Long value) {
            addCriterion("application_form_id <>", value, "applicationFormId");
            return (Criteria) this;
        }

        public Criteria andApplicationFormIdGreaterThan(Long value) {
            addCriterion("application_form_id >", value, "applicationFormId");
            return (Criteria) this;
        }

        public Criteria andApplicationFormIdGreaterThanOrEqualTo(Long value) {
            addCriterion("application_form_id >=", value, "applicationFormId");
            return (Criteria) this;
        }

        public Criteria andApplicationFormIdLessThan(Long value) {
            addCriterion("application_form_id <", value, "applicationFormId");
            return (Criteria) this;
        }

        public Criteria andApplicationFormIdLessThanOrEqualTo(Long value) {
            addCriterion("application_form_id <=", value, "applicationFormId");
            return (Criteria) this;
        }

        public Criteria andApplicationFormIdIn(List<Long> values) {
            addCriterion("application_form_id in", values, "applicationFormId");
            return (Criteria) this;
        }

        public Criteria andApplicationFormIdNotIn(List<Long> values) {
            addCriterion("application_form_id not in", values, "applicationFormId");
            return (Criteria) this;
        }

        public Criteria andApplicationFormIdBetween(Long value1, Long value2) {
            addCriterion("application_form_id between", value1, value2, "applicationFormId");
            return (Criteria) this;
        }

        public Criteria andApplicationFormIdNotBetween(Long value1, Long value2) {
            addCriterion("application_form_id not between", value1, value2, "applicationFormId");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameIsNull() {
            addCriterion("application_photographer_name is null");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameIsNotNull() {
            addCriterion("application_photographer_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameEqualTo(String value) {
            addCriterion("application_photographer_name =", value, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameNotEqualTo(String value) {
            addCriterion("application_photographer_name <>", value, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameGreaterThan(String value) {
            addCriterion("application_photographer_name >", value, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameGreaterThanOrEqualTo(String value) {
            addCriterion("application_photographer_name >=", value, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameLessThan(String value) {
            addCriterion("application_photographer_name <", value, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameLessThanOrEqualTo(String value) {
            addCriterion("application_photographer_name <=", value, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameLike(String value) {
            addCriterion("application_photographer_name like", value, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameNotLike(String value) {
            addCriterion("application_photographer_name not like", value, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameIn(List<String> values) {
            addCriterion("application_photographer_name in", values, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameNotIn(List<String> values) {
            addCriterion("application_photographer_name not in", values, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameBetween(String value1, String value2) {
            addCriterion("application_photographer_name between", value1, value2, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerNameNotBetween(String value1, String value2) {
            addCriterion("application_photographer_name not between", value1, value2, "applicationPhotographerName");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderIsNull() {
            addCriterion("application_photographer_gender is null");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderIsNotNull() {
            addCriterion("application_photographer_gender is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderEqualTo(String value) {
            addCriterion("application_photographer_gender =", value, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderNotEqualTo(String value) {
            addCriterion("application_photographer_gender <>", value, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderGreaterThan(String value) {
            addCriterion("application_photographer_gender >", value, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderGreaterThanOrEqualTo(String value) {
            addCriterion("application_photographer_gender >=", value, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderLessThan(String value) {
            addCriterion("application_photographer_gender <", value, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderLessThanOrEqualTo(String value) {
            addCriterion("application_photographer_gender <=", value, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderLike(String value) {
            addCriterion("application_photographer_gender like", value, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderNotLike(String value) {
            addCriterion("application_photographer_gender not like", value, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderIn(List<String> values) {
            addCriterion("application_photographer_gender in", values, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderNotIn(List<String> values) {
            addCriterion("application_photographer_gender not in", values, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderBetween(String value1, String value2) {
            addCriterion("application_photographer_gender between", value1, value2, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationPhotographerGenderNotBetween(String value1, String value2) {
            addCriterion("application_photographer_gender not between", value1, value2, "applicationPhotographerGender");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberIsNull() {
            addCriterion("application_id_number is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberIsNotNull() {
            addCriterion("application_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberEqualTo(Integer value) {
            addCriterion("application_id_number =", value, "applicationIdNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberNotEqualTo(Integer value) {
            addCriterion("application_id_number <>", value, "applicationIdNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberGreaterThan(Integer value) {
            addCriterion("application_id_number >", value, "applicationIdNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("application_id_number >=", value, "applicationIdNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberLessThan(Integer value) {
            addCriterion("application_id_number <", value, "applicationIdNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberLessThanOrEqualTo(Integer value) {
            addCriterion("application_id_number <=", value, "applicationIdNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberIn(List<Integer> values) {
            addCriterion("application_id_number in", values, "applicationIdNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberNotIn(List<Integer> values) {
            addCriterion("application_id_number not in", values, "applicationIdNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberBetween(Integer value1, Integer value2) {
            addCriterion("application_id_number between", value1, value2, "applicationIdNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("application_id_number not between", value1, value2, "applicationIdNumber");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlIsNull() {
            addCriterion("application_works_url is null");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlIsNotNull() {
            addCriterion("application_works_url is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlEqualTo(String value) {
            addCriterion("application_works_url =", value, "applicationWorksUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlNotEqualTo(String value) {
            addCriterion("application_works_url <>", value, "applicationWorksUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlGreaterThan(String value) {
            addCriterion("application_works_url >", value, "applicationWorksUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlGreaterThanOrEqualTo(String value) {
            addCriterion("application_works_url >=", value, "applicationWorksUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlLessThan(String value) {
            addCriterion("application_works_url <", value, "applicationWorksUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlLessThanOrEqualTo(String value) {
            addCriterion("application_works_url <=", value, "applicationWorksUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlLike(String value) {
            addCriterion("application_works_url like", value, "applicationWorksUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlNotLike(String value) {
            addCriterion("application_works_url not like", value, "applicationWorksUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlIn(List<String> values) {
            addCriterion("application_works_url in", values, "applicationWorksUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlNotIn(List<String> values) {
            addCriterion("application_works_url not in", values, "applicationWorksUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlBetween(String value1, String value2) {
            addCriterion("application_works_url between", value1, value2, "applicationWorksUrl");
            return (Criteria) this;
        }

        public Criteria andApplicationWorksUrlNotBetween(String value1, String value2) {
            addCriterion("application_works_url not between", value1, value2, "applicationWorksUrl");
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

        public Criteria andApplicationStutasIsNull() {
            addCriterion("application_stutas is null");
            return (Criteria) this;
        }

        public Criteria andApplicationStutasIsNotNull() {
            addCriterion("application_stutas is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationStutasEqualTo(Integer value) {
            addCriterion("application_stutas =", value, "applicationStutas");
            return (Criteria) this;
        }

        public Criteria andApplicationStutasNotEqualTo(Integer value) {
            addCriterion("application_stutas <>", value, "applicationStutas");
            return (Criteria) this;
        }

        public Criteria andApplicationStutasGreaterThan(Integer value) {
            addCriterion("application_stutas >", value, "applicationStutas");
            return (Criteria) this;
        }

        public Criteria andApplicationStutasGreaterThanOrEqualTo(Integer value) {
            addCriterion("application_stutas >=", value, "applicationStutas");
            return (Criteria) this;
        }

        public Criteria andApplicationStutasLessThan(Integer value) {
            addCriterion("application_stutas <", value, "applicationStutas");
            return (Criteria) this;
        }

        public Criteria andApplicationStutasLessThanOrEqualTo(Integer value) {
            addCriterion("application_stutas <=", value, "applicationStutas");
            return (Criteria) this;
        }

        public Criteria andApplicationStutasIn(List<Integer> values) {
            addCriterion("application_stutas in", values, "applicationStutas");
            return (Criteria) this;
        }

        public Criteria andApplicationStutasNotIn(List<Integer> values) {
            addCriterion("application_stutas not in", values, "applicationStutas");
            return (Criteria) this;
        }

        public Criteria andApplicationStutasBetween(Integer value1, Integer value2) {
            addCriterion("application_stutas between", value1, value2, "applicationStutas");
            return (Criteria) this;
        }

        public Criteria andApplicationStutasNotBetween(Integer value1, Integer value2) {
            addCriterion("application_stutas not between", value1, value2, "applicationStutas");
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