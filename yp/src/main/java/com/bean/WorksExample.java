package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorksExample() {
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

        public Criteria andWorksDescriptionIsNull() {
            addCriterion("works_description is null");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionIsNotNull() {
            addCriterion("works_description is not null");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionEqualTo(String value) {
            addCriterion("works_description =", value, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionNotEqualTo(String value) {
            addCriterion("works_description <>", value, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionGreaterThan(String value) {
            addCriterion("works_description >", value, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("works_description >=", value, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionLessThan(String value) {
            addCriterion("works_description <", value, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionLessThanOrEqualTo(String value) {
            addCriterion("works_description <=", value, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionLike(String value) {
            addCriterion("works_description like", value, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionNotLike(String value) {
            addCriterion("works_description not like", value, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionIn(List<String> values) {
            addCriterion("works_description in", values, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionNotIn(List<String> values) {
            addCriterion("works_description not in", values, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionBetween(String value1, String value2) {
            addCriterion("works_description between", value1, value2, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksDescriptionNotBetween(String value1, String value2) {
            addCriterion("works_description not between", value1, value2, "worksDescription");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlIsNull() {
            addCriterion("works_img_url is null");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlIsNotNull() {
            addCriterion("works_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlEqualTo(String value) {
            addCriterion("works_img_url =", value, "worksImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlNotEqualTo(String value) {
            addCriterion("works_img_url <>", value, "worksImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlGreaterThan(String value) {
            addCriterion("works_img_url >", value, "worksImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("works_img_url >=", value, "worksImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlLessThan(String value) {
            addCriterion("works_img_url <", value, "worksImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlLessThanOrEqualTo(String value) {
            addCriterion("works_img_url <=", value, "worksImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlLike(String value) {
            addCriterion("works_img_url like", value, "worksImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlNotLike(String value) {
            addCriterion("works_img_url not like", value, "worksImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlIn(List<String> values) {
            addCriterion("works_img_url in", values, "worksImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlNotIn(List<String> values) {
            addCriterion("works_img_url not in", values, "worksImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlBetween(String value1, String value2) {
            addCriterion("works_img_url between", value1, value2, "worksImgUrl");
            return (Criteria) this;
        }

        public Criteria andWorksImgUrlNotBetween(String value1, String value2) {
            addCriterion("works_img_url not between", value1, value2, "worksImgUrl");
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

        public Criteria andWorksStyleIsNull() {
            addCriterion("works_style is null");
            return (Criteria) this;
        }

        public Criteria andWorksStyleIsNotNull() {
            addCriterion("works_style is not null");
            return (Criteria) this;
        }

        public Criteria andWorksStyleEqualTo(String value) {
            addCriterion("works_style =", value, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksStyleNotEqualTo(String value) {
            addCriterion("works_style <>", value, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksStyleGreaterThan(String value) {
            addCriterion("works_style >", value, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksStyleGreaterThanOrEqualTo(String value) {
            addCriterion("works_style >=", value, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksStyleLessThan(String value) {
            addCriterion("works_style <", value, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksStyleLessThanOrEqualTo(String value) {
            addCriterion("works_style <=", value, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksStyleLike(String value) {
            addCriterion("works_style like", value, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksStyleNotLike(String value) {
            addCriterion("works_style not like", value, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksStyleIn(List<String> values) {
            addCriterion("works_style in", values, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksStyleNotIn(List<String> values) {
            addCriterion("works_style not in", values, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksStyleBetween(String value1, String value2) {
            addCriterion("works_style between", value1, value2, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksStyleNotBetween(String value1, String value2) {
            addCriterion("works_style not between", value1, value2, "worksStyle");
            return (Criteria) this;
        }

        public Criteria andWorksCreateIsNull() {
            addCriterion("works_create is null");
            return (Criteria) this;
        }

        public Criteria andWorksCreateIsNotNull() {
            addCriterion("works_create is not null");
            return (Criteria) this;
        }

        public Criteria andWorksCreateEqualTo(Date value) {
            addCriterion("works_create =", value, "worksCreate");
            return (Criteria) this;
        }

        public Criteria andWorksCreateNotEqualTo(Date value) {
            addCriterion("works_create <>", value, "worksCreate");
            return (Criteria) this;
        }

        public Criteria andWorksCreateGreaterThan(Date value) {
            addCriterion("works_create >", value, "worksCreate");
            return (Criteria) this;
        }

        public Criteria andWorksCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("works_create >=", value, "worksCreate");
            return (Criteria) this;
        }

        public Criteria andWorksCreateLessThan(Date value) {
            addCriterion("works_create <", value, "worksCreate");
            return (Criteria) this;
        }

        public Criteria andWorksCreateLessThanOrEqualTo(Date value) {
            addCriterion("works_create <=", value, "worksCreate");
            return (Criteria) this;
        }

        public Criteria andWorksCreateIn(List<Date> values) {
            addCriterion("works_create in", values, "worksCreate");
            return (Criteria) this;
        }

        public Criteria andWorksCreateNotIn(List<Date> values) {
            addCriterion("works_create not in", values, "worksCreate");
            return (Criteria) this;
        }

        public Criteria andWorksCreateBetween(Date value1, Date value2) {
            addCriterion("works_create between", value1, value2, "worksCreate");
            return (Criteria) this;
        }

        public Criteria andWorksCreateNotBetween(Date value1, Date value2) {
            addCriterion("works_create not between", value1, value2, "worksCreate");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdIsNull() {
            addCriterion("work_photo_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdIsNotNull() {
            addCriterion("work_photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdEqualTo(Integer value) {
            addCriterion("work_photo_id =", value, "workPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdNotEqualTo(Integer value) {
            addCriterion("work_photo_id <>", value, "workPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdGreaterThan(Integer value) {
            addCriterion("work_photo_id >", value, "workPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_photo_id >=", value, "workPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdLessThan(Integer value) {
            addCriterion("work_photo_id <", value, "workPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdLessThanOrEqualTo(Integer value) {
            addCriterion("work_photo_id <=", value, "workPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdIn(List<Integer> values) {
            addCriterion("work_photo_id in", values, "workPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdNotIn(List<Integer> values) {
            addCriterion("work_photo_id not in", values, "workPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdBetween(Integer value1, Integer value2) {
            addCriterion("work_photo_id between", value1, value2, "workPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("work_photo_id not between", value1, value2, "workPhotoId");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateIsNull() {
            addCriterion("work_photo_state is null");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateIsNotNull() {
            addCriterion("work_photo_state is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateEqualTo(Integer value) {
            addCriterion("work_photo_state =", value, "workPhotoState");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateNotEqualTo(Integer value) {
            addCriterion("work_photo_state <>", value, "workPhotoState");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateGreaterThan(Integer value) {
            addCriterion("work_photo_state >", value, "workPhotoState");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_photo_state >=", value, "workPhotoState");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateLessThan(Integer value) {
            addCriterion("work_photo_state <", value, "workPhotoState");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateLessThanOrEqualTo(Integer value) {
            addCriterion("work_photo_state <=", value, "workPhotoState");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateIn(List<Integer> values) {
            addCriterion("work_photo_state in", values, "workPhotoState");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateNotIn(List<Integer> values) {
            addCriterion("work_photo_state not in", values, "workPhotoState");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateBetween(Integer value1, Integer value2) {
            addCriterion("work_photo_state between", value1, value2, "workPhotoState");
            return (Criteria) this;
        }

        public Criteria andWorkPhotoStateNotBetween(Integer value1, Integer value2) {
            addCriterion("work_photo_state not between", value1, value2, "workPhotoState");
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