package com.bean;

import java.util.ArrayList;
import java.util.List;

public class Custom_madeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Custom_madeExample() {
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

        public Criteria andCustomMadeIdIsNull() {
            addCriterion("custom_made_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomMadeIdIsNotNull() {
            addCriterion("custom_made_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomMadeIdEqualTo(Long value) {
            addCriterion("custom_made_id =", value, "customMadeId");
            return (Criteria) this;
        }

        public Criteria andCustomMadeIdNotEqualTo(Long value) {
            addCriterion("custom_made_id <>", value, "customMadeId");
            return (Criteria) this;
        }

        public Criteria andCustomMadeIdGreaterThan(Long value) {
            addCriterion("custom_made_id >", value, "customMadeId");
            return (Criteria) this;
        }

        public Criteria andCustomMadeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("custom_made_id >=", value, "customMadeId");
            return (Criteria) this;
        }

        public Criteria andCustomMadeIdLessThan(Long value) {
            addCriterion("custom_made_id <", value, "customMadeId");
            return (Criteria) this;
        }

        public Criteria andCustomMadeIdLessThanOrEqualTo(Long value) {
            addCriterion("custom_made_id <=", value, "customMadeId");
            return (Criteria) this;
        }

        public Criteria andCustomMadeIdIn(List<Long> values) {
            addCriterion("custom_made_id in", values, "customMadeId");
            return (Criteria) this;
        }

        public Criteria andCustomMadeIdNotIn(List<Long> values) {
            addCriterion("custom_made_id not in", values, "customMadeId");
            return (Criteria) this;
        }

        public Criteria andCustomMadeIdBetween(Long value1, Long value2) {
            addCriterion("custom_made_id between", value1, value2, "customMadeId");
            return (Criteria) this;
        }

        public Criteria andCustomMadeIdNotBetween(Long value1, Long value2) {
            addCriterion("custom_made_id not between", value1, value2, "customMadeId");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNull() {
            addCriterion("college_name is null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNotNull() {
            addCriterion("college_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameEqualTo(String value) {
            addCriterion("college_name =", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotEqualTo(String value) {
            addCriterion("college_name <>", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThan(String value) {
            addCriterion("college_name >", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("college_name >=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThan(String value) {
            addCriterion("college_name <", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThanOrEqualTo(String value) {
            addCriterion("college_name <=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLike(String value) {
            addCriterion("college_name like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotLike(String value) {
            addCriterion("college_name not like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIn(List<String> values) {
            addCriterion("college_name in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotIn(List<String> values) {
            addCriterion("college_name not in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameBetween(String value1, String value2) {
            addCriterion("college_name between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotBetween(String value1, String value2) {
            addCriterion("college_name not between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityIsNull() {
            addCriterion("people_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityIsNotNull() {
            addCriterion("people_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityEqualTo(Integer value) {
            addCriterion("people_quantity =", value, "peopleQuantity");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityNotEqualTo(Integer value) {
            addCriterion("people_quantity <>", value, "peopleQuantity");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityGreaterThan(Integer value) {
            addCriterion("people_quantity >", value, "peopleQuantity");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("people_quantity >=", value, "peopleQuantity");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityLessThan(Integer value) {
            addCriterion("people_quantity <", value, "peopleQuantity");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("people_quantity <=", value, "peopleQuantity");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityIn(List<Integer> values) {
            addCriterion("people_quantity in", values, "peopleQuantity");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityNotIn(List<Integer> values) {
            addCriterion("people_quantity not in", values, "peopleQuantity");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityBetween(Integer value1, Integer value2) {
            addCriterion("people_quantity between", value1, value2, "peopleQuantity");
            return (Criteria) this;
        }

        public Criteria andPeopleQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("people_quantity not between", value1, value2, "peopleQuantity");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberIsNull() {
            addCriterion("contact_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberIsNotNull() {
            addCriterion("contact_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberEqualTo(String value) {
            addCriterion("contact_phone_number =", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotEqualTo(String value) {
            addCriterion("contact_phone_number <>", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberGreaterThan(String value) {
            addCriterion("contact_phone_number >", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone_number >=", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberLessThan(String value) {
            addCriterion("contact_phone_number <", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("contact_phone_number <=", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberLike(String value) {
            addCriterion("contact_phone_number like", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotLike(String value) {
            addCriterion("contact_phone_number not like", value, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberIn(List<String> values) {
            addCriterion("contact_phone_number in", values, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotIn(List<String> values) {
            addCriterion("contact_phone_number not in", values, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberBetween(String value1, String value2) {
            addCriterion("contact_phone_number between", value1, value2, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("contact_phone_number not between", value1, value2, "contactPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andExtraInformationIsNull() {
            addCriterion("extra_information is null");
            return (Criteria) this;
        }

        public Criteria andExtraInformationIsNotNull() {
            addCriterion("extra_information is not null");
            return (Criteria) this;
        }

        public Criteria andExtraInformationEqualTo(String value) {
            addCriterion("extra_information =", value, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andExtraInformationNotEqualTo(String value) {
            addCriterion("extra_information <>", value, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andExtraInformationGreaterThan(String value) {
            addCriterion("extra_information >", value, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andExtraInformationGreaterThanOrEqualTo(String value) {
            addCriterion("extra_information >=", value, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andExtraInformationLessThan(String value) {
            addCriterion("extra_information <", value, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andExtraInformationLessThanOrEqualTo(String value) {
            addCriterion("extra_information <=", value, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andExtraInformationLike(String value) {
            addCriterion("extra_information like", value, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andExtraInformationNotLike(String value) {
            addCriterion("extra_information not like", value, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andExtraInformationIn(List<String> values) {
            addCriterion("extra_information in", values, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andExtraInformationNotIn(List<String> values) {
            addCriterion("extra_information not in", values, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andExtraInformationBetween(String value1, String value2) {
            addCriterion("extra_information between", value1, value2, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andExtraInformationNotBetween(String value1, String value2) {
            addCriterion("extra_information not between", value1, value2, "extraInformation");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIsNull() {
            addCriterion("custom_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIsNotNull() {
            addCriterion("custom_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomTypeEqualTo(Integer value) {
            addCriterion("custom_type =", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotEqualTo(Integer value) {
            addCriterion("custom_type <>", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeGreaterThan(Integer value) {
            addCriterion("custom_type >", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("custom_type >=", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLessThan(Integer value) {
            addCriterion("custom_type <", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeLessThanOrEqualTo(Integer value) {
            addCriterion("custom_type <=", value, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeIn(List<Integer> values) {
            addCriterion("custom_type in", values, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotIn(List<Integer> values) {
            addCriterion("custom_type not in", values, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeBetween(Integer value1, Integer value2) {
            addCriterion("custom_type between", value1, value2, "customType");
            return (Criteria) this;
        }

        public Criteria andCustomTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("custom_type not between", value1, value2, "customType");
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