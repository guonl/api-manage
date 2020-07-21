package com.guonl.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TApiControllerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TApiControllerExample() {
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

    public TApiControllerExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public TApiControllerExample orderBy(String ... orderByClauses) {
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
        TApiControllerExample example = new TApiControllerExample();
        return example.createCriteria();
    }

    public TApiControllerExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public TApiControllerExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andControllerIdEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerIdNotEqualTo(Integer value) {
            addCriterion("controller_id <>", value, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdNotEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerIdGreaterThan(Integer value) {
            addCriterion("controller_id >", value, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdGreaterThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("controller_id >=", value, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdGreaterThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerIdLessThan(Integer value) {
            addCriterion("controller_id <", value, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdLessThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerIdLessThanOrEqualTo(Integer value) {
            addCriterion("controller_id <=", value, "controllerId");
            return (Criteria) this;
        }

        public Criteria andControllerIdLessThanOrEqualToColumn(TApiController.Column column) {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("project_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("project_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("project_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("project_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("project_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("project_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andControllerNameIsNull() {
            addCriterion("controller_name is null");
            return (Criteria) this;
        }

        public Criteria andControllerNameIsNotNull() {
            addCriterion("controller_name is not null");
            return (Criteria) this;
        }

        public Criteria andControllerNameEqualTo(String value) {
            addCriterion("controller_name =", value, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerNameEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerNameNotEqualTo(String value) {
            addCriterion("controller_name <>", value, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerNameNotEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerNameGreaterThan(String value) {
            addCriterion("controller_name >", value, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerNameGreaterThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerNameGreaterThanOrEqualTo(String value) {
            addCriterion("controller_name >=", value, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerNameGreaterThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerNameLessThan(String value) {
            addCriterion("controller_name <", value, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerNameLessThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerNameLessThanOrEqualTo(String value) {
            addCriterion("controller_name <=", value, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerNameLessThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerNameLike(String value) {
            addCriterion("controller_name like", value, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerNameNotLike(String value) {
            addCriterion("controller_name not like", value, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerNameIn(List<String> values) {
            addCriterion("controller_name in", values, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerNameNotIn(List<String> values) {
            addCriterion("controller_name not in", values, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerNameBetween(String value1, String value2) {
            addCriterion("controller_name between", value1, value2, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerNameNotBetween(String value1, String value2) {
            addCriterion("controller_name not between", value1, value2, "controllerName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameIsNull() {
            addCriterion("controller_short_name is null");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameIsNotNull() {
            addCriterion("controller_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameEqualTo(String value) {
            addCriterion("controller_short_name =", value, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_short_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerShortNameNotEqualTo(String value) {
            addCriterion("controller_short_name <>", value, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameNotEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_short_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerShortNameGreaterThan(String value) {
            addCriterion("controller_short_name >", value, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameGreaterThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_short_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("controller_short_name >=", value, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameGreaterThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_short_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerShortNameLessThan(String value) {
            addCriterion("controller_short_name <", value, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameLessThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_short_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerShortNameLessThanOrEqualTo(String value) {
            addCriterion("controller_short_name <=", value, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameLessThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_short_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerShortNameLike(String value) {
            addCriterion("controller_short_name like", value, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameNotLike(String value) {
            addCriterion("controller_short_name not like", value, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameIn(List<String> values) {
            addCriterion("controller_short_name in", values, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameNotIn(List<String> values) {
            addCriterion("controller_short_name not in", values, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameBetween(String value1, String value2) {
            addCriterion("controller_short_name between", value1, value2, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerShortNameNotBetween(String value1, String value2) {
            addCriterion("controller_short_name not between", value1, value2, "controllerShortName");
            return (Criteria) this;
        }

        public Criteria andControllerDescIsNull() {
            addCriterion("controller_desc is null");
            return (Criteria) this;
        }

        public Criteria andControllerDescIsNotNull() {
            addCriterion("controller_desc is not null");
            return (Criteria) this;
        }

        public Criteria andControllerDescEqualTo(String value) {
            addCriterion("controller_desc =", value, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerDescEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_desc = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerDescNotEqualTo(String value) {
            addCriterion("controller_desc <>", value, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerDescNotEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_desc <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerDescGreaterThan(String value) {
            addCriterion("controller_desc >", value, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerDescGreaterThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_desc > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerDescGreaterThanOrEqualTo(String value) {
            addCriterion("controller_desc >=", value, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerDescGreaterThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_desc >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerDescLessThan(String value) {
            addCriterion("controller_desc <", value, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerDescLessThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_desc < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerDescLessThanOrEqualTo(String value) {
            addCriterion("controller_desc <=", value, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerDescLessThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_desc <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerDescLike(String value) {
            addCriterion("controller_desc like", value, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerDescNotLike(String value) {
            addCriterion("controller_desc not like", value, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerDescIn(List<String> values) {
            addCriterion("controller_desc in", values, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerDescNotIn(List<String> values) {
            addCriterion("controller_desc not in", values, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerDescBetween(String value1, String value2) {
            addCriterion("controller_desc between", value1, value2, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerDescNotBetween(String value1, String value2) {
            addCriterion("controller_desc not between", value1, value2, "controllerDesc");
            return (Criteria) this;
        }

        public Criteria andControllerStatusIsNull() {
            addCriterion("controller_status is null");
            return (Criteria) this;
        }

        public Criteria andControllerStatusIsNotNull() {
            addCriterion("controller_status is not null");
            return (Criteria) this;
        }

        public Criteria andControllerStatusEqualTo(Integer value) {
            addCriterion("controller_status =", value, "controllerStatus");
            return (Criteria) this;
        }

        public Criteria andControllerStatusEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerStatusNotEqualTo(Integer value) {
            addCriterion("controller_status <>", value, "controllerStatus");
            return (Criteria) this;
        }

        public Criteria andControllerStatusNotEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerStatusGreaterThan(Integer value) {
            addCriterion("controller_status >", value, "controllerStatus");
            return (Criteria) this;
        }

        public Criteria andControllerStatusGreaterThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("controller_status >=", value, "controllerStatus");
            return (Criteria) this;
        }

        public Criteria andControllerStatusGreaterThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerStatusLessThan(Integer value) {
            addCriterion("controller_status <", value, "controllerStatus");
            return (Criteria) this;
        }

        public Criteria andControllerStatusLessThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("controller_status <=", value, "controllerStatus");
            return (Criteria) this;
        }

        public Criteria andControllerStatusLessThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("controller_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andControllerStatusIn(List<Integer> values) {
            addCriterion("controller_status in", values, "controllerStatus");
            return (Criteria) this;
        }

        public Criteria andControllerStatusNotIn(List<Integer> values) {
            addCriterion("controller_status not in", values, "controllerStatus");
            return (Criteria) this;
        }

        public Criteria andControllerStatusBetween(Integer value1, Integer value2) {
            addCriterion("controller_status between", value1, value2, "controllerStatus");
            return (Criteria) this;
        }

        public Criteria andControllerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("controller_status not between", value1, value2, "controllerStatus");
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

        public Criteria andCreateTimeEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("create_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("create_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("create_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("create_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("create_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualToColumn(TApiController.Column column) {
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

        public Criteria andUpdateTimeEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(TApiController.Column column) {
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

        public Criteria andDelFlagEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("del_flag = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Boolean value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("del_flag <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Boolean value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("del_flag > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualToColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("del_flag >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Boolean value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanColumn(TApiController.Column column) {
            addCriterion(new StringBuilder("del_flag < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualToColumn(TApiController.Column column) {
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
        private TApiControllerExample example;

        protected Criteria(TApiControllerExample example) {
            super();
            this.example = example;
        }

        public TApiControllerExample example() {
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
        void example(com.guonl.entity.TApiControllerExample example);
    }
}