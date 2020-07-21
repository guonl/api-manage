package com.guonl.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TApiProject {
    private Integer projectId;

    private String projectName;

    private String projectDesc;

    private String manageUrl;

    private Integer projectStatus;

    private Date createTime;

    private Date updateTime;

    private Boolean delFlag;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc == null ? null : projectDesc.trim();
    }

    public String getManageUrl() {
        return manageUrl;
    }

    public void setManageUrl(String manageUrl) {
        this.manageUrl = manageUrl == null ? null : manageUrl.trim();
    }

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
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

    public static TApiProject.Builder builder() {
        return new TApiProject.Builder();
    }

    public static class Builder {
        private TApiProject obj;

        public Builder() {
            this.obj = new TApiProject();
        }

        public Builder projectId(Integer projectId) {
            obj.setProjectId(projectId);
            return this;
        }

        public Builder projectName(String projectName) {
            obj.setProjectName(projectName);
            return this;
        }

        public Builder projectDesc(String projectDesc) {
            obj.setProjectDesc(projectDesc);
            return this;
        }

        public Builder manageUrl(String manageUrl) {
            obj.setManageUrl(manageUrl);
            return this;
        }

        public Builder projectStatus(Integer projectStatus) {
            obj.setProjectStatus(projectStatus);
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

        public TApiProject build() {
            return this.obj;
        }
    }

    public enum Column {
        projectId("project_id", "projectId", "INTEGER", false),
        projectName("project_name", "projectName", "VARCHAR", false),
        projectDesc("project_desc", "projectDesc", "VARCHAR", false),
        manageUrl("manage_url", "manageUrl", "VARCHAR", false),
        projectStatus("project_status", "projectStatus", "INTEGER", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        delFlag("del_flag", "delFlag", "BIT", false);

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