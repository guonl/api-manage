package com.guonl.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TApiUrl {
    private Integer urlId;

    private Integer controllerId;

    private String requestUrl;

    private String methodName;

    private String methodType;

    private String methodContentType;

    private String returnParamClass;

    private Integer urlStatus;

    private String urlLabel;

    private String methodDesc;

    private Date createTime;

    private Date updateTime;

    private Boolean delFlag;

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public Integer getControllerId() {
        return controllerId;
    }

    public void setControllerId(Integer controllerId) {
        this.controllerId = controllerId;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType == null ? null : methodType.trim();
    }

    public String getMethodContentType() {
        return methodContentType;
    }

    public void setMethodContentType(String methodContentType) {
        this.methodContentType = methodContentType == null ? null : methodContentType.trim();
    }

    public String getReturnParamClass() {
        return returnParamClass;
    }

    public void setReturnParamClass(String returnParamClass) {
        this.returnParamClass = returnParamClass == null ? null : returnParamClass.trim();
    }

    public Integer getUrlStatus() {
        return urlStatus;
    }

    public void setUrlStatus(Integer urlStatus) {
        this.urlStatus = urlStatus;
    }

    public String getUrlLabel() {
        return urlLabel;
    }

    public void setUrlLabel(String urlLabel) {
        this.urlLabel = urlLabel == null ? null : urlLabel.trim();
    }

    public String getMethodDesc() {
        return methodDesc;
    }

    public void setMethodDesc(String methodDesc) {
        this.methodDesc = methodDesc == null ? null : methodDesc.trim();
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

    public static TApiUrl.Builder builder() {
        return new TApiUrl.Builder();
    }

    public static class Builder {
        private TApiUrl obj;

        public Builder() {
            this.obj = new TApiUrl();
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

        public TApiUrl build() {
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