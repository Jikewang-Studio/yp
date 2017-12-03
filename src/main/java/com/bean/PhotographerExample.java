package com.bean;

import java.util.ArrayList;
import java.util.List;

public class PhotographerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhotographerExample() {
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andWorksIdIsNull() {
            addCriterion("works_id is null");
            return (Criteria) this;
        }

        public Criteria andWorksIdIsNotNull() {
            addCriterion("works_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorksIdEqualTo(Long value) {
            addCriterion("works_id =", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotEqualTo(Long value) {
            addCriterion("works_id <>", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdGreaterThan(Long value) {
            addCriterion("works_id >", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdGreaterThanOrEqualTo(Long value) {
            addCriterion("works_id >=", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdLessThan(Long value) {
            addCriterion("works_id <", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdLessThanOrEqualTo(Long value) {
            addCriterion("works_id <=", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdIn(List<Long> values) {
            addCriterion("works_id in", values, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotIn(List<Long> values) {
            addCriterion("works_id not in", values, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdBetween(Long value1, Long value2) {
            addCriterion("works_id between", value1, value2, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotBetween(Long value1, Long value2) {
            addCriterion("works_id not between", value1, value2, "worksId");
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

        public Criteria andOrederIdIsNull() {
            addCriterion("oreder_id is null");
            return (Criteria) this;
        }

        public Criteria andOrederIdIsNotNull() {
            addCriterion("oreder_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrederIdEqualTo(Long value) {
            addCriterion("oreder_id =", value, "orederId");
            return (Criteria) this;
        }

        public Criteria andOrederIdNotEqualTo(Long value) {
            addCriterion("oreder_id <>", value, "orederId");
            return (Criteria) this;
        }

        public Criteria andOrederIdGreaterThan(Long value) {
            addCriterion("oreder_id >", value, "orederId");
            return (Criteria) this;
        }

        public Criteria andOrederIdGreaterThanOrEqualTo(Long value) {
            addCriterion("oreder_id >=", value, "orederId");
            return (Criteria) this;
        }

        public Criteria andOrederIdLessThan(Long value) {
            addCriterion("oreder_id <", value, "orederId");
            return (Criteria) this;
        }

        public Criteria andOrederIdLessThanOrEqualTo(Long value) {
            addCriterion("oreder_id <=", value, "orederId");
            return (Criteria) this;
        }

        public Criteria andOrederIdIn(List<Long> values) {
            addCriterion("oreder_id in", values, "orederId");
            return (Criteria) this;
        }

        public Criteria andOrederIdNotIn(List<Long> values) {
            addCriterion("oreder_id not in", values, "orederId");
            return (Criteria) this;
        }

        public Criteria andOrederIdBetween(Long value1, Long value2) {
            addCriterion("oreder_id between", value1, value2, "orederId");
            return (Criteria) this;
        }

        public Criteria andOrederIdNotBetween(Long value1, Long value2) {
            addCriterion("oreder_id not between", value1, value2, "orederId");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesIsNull() {
            addCriterion("photographer_success_times is null");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesIsNotNull() {
            addCriterion("photographer_success_times is not null");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesEqualTo(Integer value) {
            addCriterion("photographer_success_times =", value, "photographerSuccessTimes");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesNotEqualTo(Integer value) {
            addCriterion("photographer_success_times <>", value, "photographerSuccessTimes");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesGreaterThan(Integer value) {
            addCriterion("photographer_success_times >", value, "photographerSuccessTimes");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("photographer_success_times >=", value, "photographerSuccessTimes");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesLessThan(Integer value) {
            addCriterion("photographer_success_times <", value, "photographerSuccessTimes");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesLessThanOrEqualTo(Integer value) {
            addCriterion("photographer_success_times <=", value, "photographerSuccessTimes");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesIn(List<Integer> values) {
            addCriterion("photographer_success_times in", values, "photographerSuccessTimes");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesNotIn(List<Integer> values) {
            addCriterion("photographer_success_times not in", values, "photographerSuccessTimes");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesBetween(Integer value1, Integer value2) {
            addCriterion("photographer_success_times between", value1, value2, "photographerSuccessTimes");
            return (Criteria) this;
        }

        public Criteria andPhotographerSuccessTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("photographer_success_times not between", value1, value2, "photographerSuccessTimes");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdIsNull() {
            addCriterion("photographer_message_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdIsNotNull() {
            addCriterion("photographer_message_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdEqualTo(Long value) {
            addCriterion("photographer_message_id =", value, "photographerMessageId");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdNotEqualTo(Long value) {
            addCriterion("photographer_message_id <>", value, "photographerMessageId");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdGreaterThan(Long value) {
            addCriterion("photographer_message_id >", value, "photographerMessageId");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("photographer_message_id >=", value, "photographerMessageId");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdLessThan(Long value) {
            addCriterion("photographer_message_id <", value, "photographerMessageId");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdLessThanOrEqualTo(Long value) {
            addCriterion("photographer_message_id <=", value, "photographerMessageId");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdIn(List<Long> values) {
            addCriterion("photographer_message_id in", values, "photographerMessageId");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdNotIn(List<Long> values) {
            addCriterion("photographer_message_id not in", values, "photographerMessageId");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdBetween(Long value1, Long value2) {
            addCriterion("photographer_message_id between", value1, value2, "photographerMessageId");
            return (Criteria) this;
        }

        public Criteria andPhotographerMessageIdNotBetween(Long value1, Long value2) {
            addCriterion("photographer_message_id not between", value1, value2, "photographerMessageId");
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