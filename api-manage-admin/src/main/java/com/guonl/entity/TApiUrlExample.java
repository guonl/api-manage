package com.guonl.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TApiUrlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TApiUrlExample() {
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

    public TApiUrlExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TApiUrlExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        TApiUrlExample example = new TApiUrlExample();
        return example.createCriteria();
    }

    public TApiUrlExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TApiUrlExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
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

        public Criteria andUrlIdIsNull() {
            addCriterion("url_id is null");
            return (Criteria) this;
        }

        public Criteria andUrlIdIsNotNull() {
            addCriterion("url_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrlIdEqualTo(Integer value) {
            addCriterion("url_id =", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlIdNotEqualTo(Integer value) {
            addCriterion("url_id <>", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlIdGreaterThan(Integer value) {
            addCriterion("url_id >", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("url_id >=", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlIdLessThan(Integer value) {
            addCriterion("url_id <", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlIdLessThanOrEqualTo(Integer value) {
            addCriterion("url_id <=", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlIdIn(List<Integer> values) {
            addCriterion("url_id in", values, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotIn(List<Integer> values) {
            addCriterion("url_id not in", values, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdBetween(Integer value1, Integer value2) {
            addCriterion("url_id between", value1, value2, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("url_id not between", value1, value2, "urlId");
            return (Criteria) this;
        }

        public Criteria andControllerIdIsNull() {
            addCriterion("controller_id is null");
            return (Criteria) this;
        }

        public Criteria andControllerIdIsNotNull() {
            addCriterion("controller_id is not null");
            return (Criteria) this;
        }

        public Criteria andControllerIdEqualTo(Integer value) {
            addCriterion("controller_id =", value, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("controller_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerIdNotEqualTo(Integer value) {
            addCriterion("controller_id <>", value, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("controller_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerIdGreaterThan(Integer value) {
            addCriterion("controller_id >", value, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("controller_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("controller_id >=", value, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("controller_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerIdLessThan(Integer value) {
            addCriterion("controller_id <", value, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("controller_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerIdLessThanOrEqualTo(Integer value) {
            addCriterion("controller_id <=", value, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("controller_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerIdIn(List<Integer> values) {
            addCriterion("controller_id in", values, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdNotIn(List<Integer> values) {
            addCriterion("controller_id not in", values, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdBetween(Integer value1, Integer value2) {
            addCriterion("controller_id between", value1, value2, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("controller_id not between", value1, value2, "controllerId");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNull() {
            addCriterion("request_url is null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIsNotNull() {
            addCriterion("request_url is not null");
            return (Criteria) this;
        }

        public Criteria andRequestUrlEqualTo(String value) {
            addCriterion("request_url =", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("request_url = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotEqualTo(String value) {
            addCriterion("request_url <>", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("request_url <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThan(String value) {
            addCriterion("request_url >", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("request_url > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("request_url >=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("request_url >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThan(String value) {
            addCriterion("request_url <", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("request_url < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("request_url <=", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("request_url <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRequestUrlLike(String value) {
            addCriterion("request_url like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotLike(String value) {
            addCriterion("request_url not like", value, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlIn(List<String> values) {
            addCriterion("request_url in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotIn(List<String> values) {
            addCriterion("request_url not in", values, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlBetween(String value1, String value2) {
            addCriterion("request_url between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andRequestUrlNotBetween(String value1, String value2) {
            addCriterion("request_url not between", value1, value2, "requestUrl");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("method_name is null");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("method_name is not null");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("method_name =", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("method_name <>", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("method_name >", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("method_name >=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("method_name <", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("method_name <=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("method_name like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("method_name not like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("method_name in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("method_name not in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("method_name between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("method_name not between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodTypeIsNull() {
            addCriterion("method_type is null");
            return (Criteria) this;
        }

        public Criteria andMethodTypeIsNotNull() {
            addCriterion("method_type is not null");
            return (Criteria) this;
        }

        public Criteria andMethodTypeEqualTo(String value) {
            addCriterion("method_type =", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotEqualTo(String value) {
            addCriterion("method_type <>", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodTypeGreaterThan(String value) {
            addCriterion("method_type >", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("method_type >=", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodTypeLessThan(String value) {
            addCriterion("method_type <", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodTypeLessThanOrEqualTo(String value) {
            addCriterion("method_type <=", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodTypeLike(String value) {
            addCriterion("method_type like", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotLike(String value) {
            addCriterion("method_type not like", value, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeIn(List<String> values) {
            addCriterion("method_type in", values, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotIn(List<String> values) {
            addCriterion("method_type not in", values, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeBetween(String value1, String value2) {
            addCriterion("method_type between", value1, value2, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodTypeNotBetween(String value1, String value2) {
            addCriterion("method_type not between", value1, value2, "methodType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeIsNull() {
            addCriterion("method_content_type is null");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeIsNotNull() {
            addCriterion("method_content_type is not null");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeEqualTo(String value) {
            addCriterion("method_content_type =", value, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_content_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeNotEqualTo(String value) {
            addCriterion("method_content_type <>", value, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_content_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeGreaterThan(String value) {
            addCriterion("method_content_type >", value, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_content_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("method_content_type >=", value, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_content_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeLessThan(String value) {
            addCriterion("method_content_type <", value, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_content_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeLessThanOrEqualTo(String value) {
            addCriterion("method_content_type <=", value, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_content_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeLike(String value) {
            addCriterion("method_content_type like", value, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeNotLike(String value) {
            addCriterion("method_content_type not like", value, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeIn(List<String> values) {
            addCriterion("method_content_type in", values, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeNotIn(List<String> values) {
            addCriterion("method_content_type not in", values, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeBetween(String value1, String value2) {
            addCriterion("method_content_type between", value1, value2, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andMethodContentTypeNotBetween(String value1, String value2) {
            addCriterion("method_content_type not between", value1, value2, "methodContentType");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassIsNull() {
            addCriterion("return_param_class is null");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassIsNotNull() {
            addCriterion("return_param_class is not null");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassEqualTo(String value) {
            addCriterion("return_param_class =", value, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("return_param_class = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnParamClassNotEqualTo(String value) {
            addCriterion("return_param_class <>", value, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("return_param_class <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnParamClassGreaterThan(String value) {
            addCriterion("return_param_class >", value, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("return_param_class > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnParamClassGreaterThanOrEqualTo(String value) {
            addCriterion("return_param_class >=", value, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("return_param_class >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnParamClassLessThan(String value) {
            addCriterion("return_param_class <", value, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("return_param_class < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnParamClassLessThanOrEqualTo(String value) {
            addCriterion("return_param_class <=", value, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("return_param_class <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andReturnParamClassLike(String value) {
            addCriterion("return_param_class like", value, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassNotLike(String value) {
            addCriterion("return_param_class not like", value, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassIn(List<String> values) {
            addCriterion("return_param_class in", values, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassNotIn(List<String> values) {
            addCriterion("return_param_class not in", values, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassBetween(String value1, String value2) {
            addCriterion("return_param_class between", value1, value2, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andReturnParamClassNotBetween(String value1, String value2) {
            addCriterion("return_param_class not between", value1, value2, "returnParamClass");
            return (Criteria) this;
        }

        public Criteria andUrlStatusIsNull() {
            addCriterion("url_status is null");
            return (Criteria) this;
        }

        public Criteria andUrlStatusIsNotNull() {
            addCriterion("url_status is not null");
            return (Criteria) this;
        }

        public Criteria andUrlStatusEqualTo(Integer value) {
            addCriterion("url_status =", value, "urlStatus");
            return (Criteria) this;
        }

        public Criteria andUrlStatusEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlStatusNotEqualTo(Integer value) {
            addCriterion("url_status <>", value, "urlStatus");
            return (Criteria) this;
        }

        public Criteria andUrlStatusNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlStatusGreaterThan(Integer value) {
            addCriterion("url_status >", value, "urlStatus");
            return (Criteria) this;
        }

        public Criteria andUrlStatusGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("url_status >=", value, "urlStatus");
            return (Criteria) this;
        }

        public Criteria andUrlStatusGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlStatusLessThan(Integer value) {
            addCriterion("url_status <", value, "urlStatus");
            return (Criteria) this;
        }

        public Criteria andUrlStatusLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlStatusLessThanOrEqualTo(Integer value) {
            addCriterion("url_status <=", value, "urlStatus");
            return (Criteria) this;
        }

        public Criteria andUrlStatusLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlStatusIn(List<Integer> values) {
            addCriterion("url_status in", values, "urlStatus");
            return (Criteria) this;
        }

        public Criteria andUrlStatusNotIn(List<Integer> values) {
            addCriterion("url_status not in", values, "urlStatus");
            return (Criteria) this;
        }

        public Criteria andUrlStatusBetween(Integer value1, Integer value2) {
            addCriterion("url_status between", value1, value2, "urlStatus");
            return (Criteria) this;
        }

        public Criteria andUrlStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("url_status not between", value1, value2, "urlStatus");
            return (Criteria) this;
        }

        public Criteria andUrlLabelIsNull() {
            addCriterion("url_label is null");
            return (Criteria) this;
        }

        public Criteria andUrlLabelIsNotNull() {
            addCriterion("url_label is not null");
            return (Criteria) this;
        }

        public Criteria andUrlLabelEqualTo(String value) {
            addCriterion("url_label =", value, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andUrlLabelEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_label = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlLabelNotEqualTo(String value) {
            addCriterion("url_label <>", value, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andUrlLabelNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_label <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlLabelGreaterThan(String value) {
            addCriterion("url_label >", value, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andUrlLabelGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_label > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlLabelGreaterThanOrEqualTo(String value) {
            addCriterion("url_label >=", value, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andUrlLabelGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_label >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlLabelLessThan(String value) {
            addCriterion("url_label <", value, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andUrlLabelLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_label < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlLabelLessThanOrEqualTo(String value) {
            addCriterion("url_label <=", value, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andUrlLabelLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("url_label <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUrlLabelLike(String value) {
            addCriterion("url_label like", value, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andUrlLabelNotLike(String value) {
            addCriterion("url_label not like", value, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andUrlLabelIn(List<String> values) {
            addCriterion("url_label in", values, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andUrlLabelNotIn(List<String> values) {
            addCriterion("url_label not in", values, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andUrlLabelBetween(String value1, String value2) {
            addCriterion("url_label between", value1, value2, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andUrlLabelNotBetween(String value1, String value2) {
            addCriterion("url_label not between", value1, value2, "urlLabel");
            return (Criteria) this;
        }

        public Criteria andMethodDescIsNull() {
            addCriterion("method_desc is null");
            return (Criteria) this;
        }

        public Criteria andMethodDescIsNotNull() {
            addCriterion("method_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMethodDescEqualTo(String value) {
            addCriterion("method_desc =", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_desc = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodDescNotEqualTo(String value) {
            addCriterion("method_desc <>", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_desc <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodDescGreaterThan(String value) {
            addCriterion("method_desc >", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_desc > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodDescGreaterThanOrEqualTo(String value) {
            addCriterion("method_desc >=", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_desc >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodDescLessThan(String value) {
            addCriterion("method_desc <", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_desc < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodDescLessThanOrEqualTo(String value) {
            addCriterion("method_desc <=", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("method_desc <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMethodDescLike(String value) {
            addCriterion("method_desc like", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescNotLike(String value) {
            addCriterion("method_desc not like", value, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescIn(List<String> values) {
            addCriterion("method_desc in", values, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescNotIn(List<String> values) {
            addCriterion("method_desc not in", values, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescBetween(String value1, String value2) {
            addCriterion("method_desc between", value1, value2, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andMethodDescNotBetween(String value1, String value2) {
            addCriterion("method_desc not between", value1, value2, "methodDesc");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("create_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("update_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Boolean value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("del_flag = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Boolean value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("del_flag <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Boolean value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("del_flag > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("del_flag >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Boolean value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("del_flag < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualToColumn(TApiUrlWithBLOBs.Column column) {
            addCriterion(new StringBuilder("del_flag <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Boolean> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Boolean> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TApiUrlExample example;

        protected Criteria(TApiUrlExample example) {
            super();
            this.example = example;
        }

        public TApiUrlExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
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

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.guonl.entity.TApiUrlExample example);
    }
}