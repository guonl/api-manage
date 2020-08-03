package com.guonl.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class TApiUrlDocWithBLOBs extends TApiUrlDoc {
    private String requestHeaders;

    private String queryParams;

    private String successRespExample;

    private String failRespExample;

    public String getRequestHeaders() {
        return requestHeaders;
    }

    public void setRequestHeaders(String requestHeaders) {
        this.requestHeaders = requestHeaders == null ? null : requestHeaders.trim();
    }

    public String getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(String queryParams) {
        this.queryParams = queryParams == null ? null : queryParams.trim();
    }

    public String getSuccessRespExample() {
        return successRespExample;
    }

    public void setSuccessRespExample(String successRespExample) {
        this.successRespExample = successRespExample == null ? null : successRespExample.trim();
    }

    public String getFailRespExample() {
        return failRespExample;
    }

    public void setFailRespExample(String failRespExample) {
        this.failRespExample = failRespExample == null ? null : failRespExample.trim();
    }

    public static TApiUrlDocWithBLOBs.Builder builder() {
        return new TApiUrlDocWithBLOBs.Builder();
    }

    public static class Builder extends TApiUrlDoc.Builder {
        private TApiUrlDocWithBLOBs obj;

        public Builder() {
            this.obj = new TApiUrlDocWithBLOBs();
        }

        public Builder urlId(Integer urlId) {
            obj.setUrlId(urlId);
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

        public Builder requestHeaders(String requestHeaders) {
            obj.setRequestHeaders(requestHeaders);
            return this;
        }

        public Builder queryParams(String queryParams) {
            obj.setQueryParams(queryParams);
            return this;
        }

        public Builder successRespExample(String successRespExample) {
            obj.setSuccessRespExample(successRespExample);
            return this;
        }

        public Builder failRespExample(String failRespExample) {
            obj.setFailRespExample(failRespExample);
            return this;
        }

        public TApiUrlDocWithBLOBs build() {
            return this.obj;
        }
    }

    public enum Column {
        urlId("url_id", "urlId", "INTEGER", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        delFlag("del_flag", "delFlag", "BIT", false),
        requestHeaders("request_headers", "requestHeaders", "LONGVARCHAR", false),
        queryParams("query_params", "queryParams", "LONGVARCHAR", false),
        successRespExample("success_resp_example", "successRespExample", "LONGVARCHAR", false),
        failRespExample("fail_resp_example", "failRespExample", "LONGVARCHAR", false);

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