package com.guonl.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TApiUrlDoc {
    private Integer urlId;

    private Date createTime;

    private Date updateTime;

    private Boolean delFlag;

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public static TApiUrlDoc.Builder builder() {
        return new TApiUrlDoc.Builder();
    }

    public static class Builder {
        private TApiUrlDoc obj;

        public Builder() {
            this.obj = new TApiUrlDoc();
        }

        public Builder urlId(Integer urlId) {
            obj.setUrlId(urlId);
            return this;
        }

        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        public Builder updateTime(Date updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        public Builder delFlag(Boolean delFlag) {
            obj.setDelFlag(delFlag);
            return this;
        }

        public TApiUrlDoc build() {
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