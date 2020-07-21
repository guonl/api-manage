package com.guonl.entity.custom;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 项目列表对象 api_project
 * 
 * @author ruoyi
 * @date 2020-07-21
 */
public class ApiProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long projectId;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String projectName;

    /** 项目描述 */
    @Excel(name = "项目描述")
    private String projectDesc;

    /** url地址 */
    @Excel(name = "url地址")
    private String manageUrl;

    /** 0-禁用 1-启用 */
    @Excel(name = "0-禁用 1-启用")
    private Integer projectStatus;

    /** 删除标识，0-未删除，1-已删除 */
    private Integer delFlag;

    public void setProjectId(Long projectId) 
    {
        this.projectId = projectId;
    }

    public Long getProjectId() 
    {
        return projectId;
    }
    public void setProjectName(String projectName) 
    {
        this.projectName = projectName;
    }

    public String getProjectName() 
    {
        return projectName;
    }
    public void setProjectDesc(String projectDesc) 
    {
        this.projectDesc = projectDesc;
    }

    public String getProjectDesc() 
    {
        return projectDesc;
    }
    public void setManageUrl(String manageUrl) 
    {
        this.manageUrl = manageUrl;
    }

    public String getManageUrl() 
    {
        return manageUrl;
    }
    public void setProjectStatus(Integer projectStatus) 
    {
        this.projectStatus = projectStatus;
    }

    public Integer getProjectStatus() 
    {
        return projectStatus;
    }
    public void setDelFlag(Integer delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Integer getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("projectId", getProjectId())
            .append("projectName", getProjectName())
            .append("projectDesc", getProjectDesc())
            .append("manageUrl", getManageUrl())
            .append("projectStatus", getProjectStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
