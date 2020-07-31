package com.guonl.entity.custom;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * controller列对象 api_controller
 *
 * @author ruoyi
 * @date 2020-07-29
 */
public class ApiController extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer controllerId;

    /**
     * 项目id
     */
    private Integer projectId;

    /**
     * 全名称
     */
    private String controllerName;

    /**
     * 简称
     */
    private String controllerShortName;

    /**
     * 描述
     */
    private String controllerDesc;

    /**
     * 0-禁用 1-启用
     */
    private Integer controllerStatus;

    /**
     * 删除标识，0-未删除，1-已删除
     */
    private Integer delFlag;

    public void setControllerId(Integer controllerId) {
        this.controllerId = controllerId;
    }

    public Integer getControllerId() {
        return controllerId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerShortName(String controllerShortName) {
        this.controllerShortName = controllerShortName;
    }

    public String getControllerShortName() {
        return controllerShortName;
    }

    public void setControllerDesc(String controllerDesc) {
        this.controllerDesc = controllerDesc;
    }

    public String getControllerDesc() {
        return controllerDesc;
    }

    public void setControllerStatus(Integer controllerStatus) {
        this.controllerStatus = controllerStatus;
    }

    public Integer getControllerStatus() {
        return controllerStatus;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("controllerId", getControllerId())
                .append("projectId", getProjectId())
                .append("controllerName", getControllerName())
                .append("controllerShortName", getControllerShortName())
                .append("controllerDesc", getControllerDesc())
                .append("controllerStatus", getControllerStatus())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("delFlag", getDelFlag())
                .toString();
    }
}
