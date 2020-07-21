package com.guonl.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class TApiUrlWithBLOBs extends TApiUrl {
    private String requestParamMap;

    private String returnParamMap;

    public String getRequestParamMap() {
        return requestParamMap;
    }

    public void setRequestParamMap(String requestParamMap) {
        this.requestParamMap = requestParamMap == null ? null : requestParamMap.trim();
    }

    public String getReturnParamMap() {
        return returnParamMap;
    }

    public void setReturnParamMap(String returnParamMap) {
        this.returnParamMap = returnParamMap == null ? null : returnParamMap.trim();
    }

    public static TApiUrlWithBLOBs.Builder builder() {
        return new TApiUrlWithBLOBs.Builder();
    }

    public static class Builder extends TApiUrl.Builder {
        private TApiUrlWithBLOBs obj;

        public Builder() {
            this.obj = new TApiUrlWithBLOBs();
        }

        public Builder urlId(Integer urlId) {
            obj.setUrlId(urlId);
            return this;
        }

        public Builder controllerId(Integer controllerId) {
            obj.setControllerId(controllerId);
            return this;
        }

        public Builder requestUrl(String requestUrl) {
            obj.setRequestUrl(requestUrl);
            return this;
        }

        public Builder methodName(String methodName) {
            obj.setMethodName(methodName);
            return this;
        }

        public Builder methodType(String methodType) {
            obj.setMethodType(methodType);
            return this;
        }

        public Builder methodContentType(String methodContentType) {
            obj.setMethodContentType(methodContentType);
            return this;
        }

        public Builder returnParamClass(String returnParamClass) {
            obj.setReturnParamClass(returnParamClass);
            return this;
        }

        public Builder urlStatus(Integer urlStatus) {
            obj.setUrlStatus(urlStatus);
            return this;
        }

        public Builder urlLabel(String urlLabel) {
            obj.setUrlLabel(urlLabel);
            return this;
        }

        public Builder methodDesc(String methodDesc) {
            obj.setMethodDesc(methodDesc);
            return this;
        }

        public Builder createTime(java.util.Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public Builder updateTime(java.util.Date updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        public Builder delFlag(Boolean delFlag) {
            obj.setDelFlag(delFlag);
            return this;
        }

        public Builder requestParamMap(String requestParamMap) {
            obj.setRequestParamMap(requestParamMap);
            return this;
        }

        public Builder returnParamMap(String returnParamMap) {
            obj.setReturnParamMap(returnParamMap);
            return this;
        }

        public TApiUrlWithBLOBs build() {
            return this.obj;
        }
    }

    public enum Column {
        urlId("url_id", "urlId", "INTEGER", false),
        controllerId("controller_id", "controllerId", "INTEGER", false),
        requestUrl("request_url", "requestUrl", "VARCHAR", false),
        methodName("method_name", "methodName", "VARCHAR", false),
        methodType("method_type", "methodType", "VARCHAR", false),
        methodContentType("method_content_type", "methodContentType", "VARCHAR", false),
        returnParamClass("return_param_class", "returnParamClass", "VARCHAR", false),
        urlStatus("url_status", "urlStatus", "INTEGER", false),
        urlLabel("url_label", "urlLabel", "VARCHAR", false),
        methodDesc("method_desc", "methodDesc", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        delFlag("del_flag", "delFlag", "BIT", false),
        requestParamMap("request_param_map", "requestParamMap", "LONGVARCHAR", false),
        returnParamMap("return_param_map", "returnParamMap", "LONGVARCHAR", false);

        private static final String BEGINNING_DELIMITER = "\"";

        private static final String ENDING_DELIMITER = "\"";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}