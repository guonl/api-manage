package com.guonl.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TApiController {
    private Integer controllerId;

    private Integer projectId;

    private String controllerName;

    private String controllerShortName;

    private String controllerDesc;

    private Integer controllerStatus;

    private Date createTime;

    private Date updateTime;

    private Boolean delFlag;

    public Integer getControllerId() {
        return controllerId;
    }

    public void setControllerId(Integer controllerId) {
        this.controllerId = controllerId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName == null ? null : controllerName.trim();
    }

    public String getControllerShortName() {
        return controllerShortName;
    }

    public void setControllerShortName(String controllerShortName) {
        this.controllerShortName = controllerShortName == null ? null : controllerShortName.trim();
    }

    public String getControllerDesc() {
        return controllerDesc;
    }

    public void setControllerDesc(String controllerDesc) {
        this.controllerDesc = controllerDesc == null ? null : controllerDesc.trim();
    }

    public Integer getControllerStatus() {
        return controllerStatus;
    }

    public void setControllerStatus(Integer controllerStatus) {
        this.controllerStatus = controllerStatus;
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

    public static TApiController.Builder builder() {
        return new TApiController.Builder();
    }

    public static class Builder {
        private TApiController obj;

        public Builder() {
            this.obj = new TApiController();
        }

        public Builder controllerId(Integer controllerId) {
            obj.setControllerId(controllerId);
            return this;
        }

        public Builder projectId(Integer projectId) {
            obj.setProjectId(projectId);
            return this;
        }

        public Builder controllerName(String controllerName) {
            obj.setControllerName(controllerName);
            return this;
        }

        public Builder controllerShortName(String controllerShortName) {
            obj.setControllerShortName(controllerShortName);
            return this;
        }

        public Builder controllerDesc(String controllerDesc) {
            obj.setControllerDesc(controllerDesc);
            return this;
        }

        public Builder controllerStatus(Integer controllerStatus) {
            obj.setControllerStatus(controllerStatus);
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

        public TApiController build() {
            return this.obj;
        }
    }

    public enum Column {
        controllerId("controller_id", "controllerId", "INTEGER", false),
        projectId("project_id", "projectId", "INTEGER", false),
        controllerName("controller_name", "controllerName", "VARCHAR", false),
        controllerShortName("controller_short_name", "controllerShortName", "VARCHAR", false),
        controllerDesc("controller_desc", "controllerDesc", "VARCHAR", false),
        controllerStatus("controller_status", "controllerStatus", "INTEGER", false),
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