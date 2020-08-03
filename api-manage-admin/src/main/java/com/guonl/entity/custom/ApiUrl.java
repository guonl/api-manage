package com.guonl.entity.custom;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * controller列对象 api_url
 *
 * @author guonl
 * @date 2020-07-29
 */
public class ApiUrl extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long urlId;

    /**
     * controller id
     */
    private Long controllerId;

    /**
     * url
     */
    private String requestUrl;

    /**
     * 方法名
     */
    private String methodName;

    /**
     * 方法类型
     */
    private String methodType;

    /**
     * 请求方式
     */
    private String methodContentType;

    /**
     * 请求参数，json
     */
    private String requestParamMap;

    /**
     * 返回对象class
     */
    private String returnParamClass;

    /**
     * 返回参数，json
     */
    private String returnParamMap;

    /**
     * 0-禁用 1-启用
     */
    private Long urlStatus;

    /**
     * 符合规范，不规范等
     */
    private String urlLabel;

    /**
     * 描述
     */
    private String methodDesc;

    /**
     * 删除标识，0-未删除，1-已删除
     */
    private Integer delFlag;

    public void setUrlId(Long urlId) {
        this.urlId = urlId;
    }

    public Long getUrlId() {
        return urlId;
    }

    public void setControllerId(Long controllerId) {
        this.controllerId = controllerId;
    }

    public Long getControllerId() {
        return controllerId;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodContentType(String methodContentType) {
        this.methodContentType = methodContentType;
    }

    public String getMethodContentType() {
        return methodContentType;
    }

    public void setRequestParamMap(String requestParamMap) {
        this.requestParamMap = requestParamMap;
    }

    public String getRequestParamMap() {
        return requestParamMap;
    }

    public void setReturnParamClass(String returnParamClass) {
        this.returnParamClass = returnParamClass;
    }

    public String getReturnParamClass() {
        return returnParamClass;
    }

    public void setReturnParamMap(String returnParamMap) {
        this.returnParamMap = returnParamMap;
    }

    public String getReturnParamMap() {
        return returnParamMap;
    }

    public void setUrlStatus(Long urlStatus) {
        this.urlStatus = urlStatus;
    }

    public Long getUrlStatus() {
        return urlStatus;
    }

    public void setUrlLabel(String urlLabel) {
        this.urlLabel = urlLabel;
    }

    public String getUrlLabel() {
        return urlLabel;
    }

    public void setMethodDesc(String methodDesc) {
        this.methodDesc = methodDesc;
    }

    public String getMethodDesc() {
        return methodDesc;
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
                .append("urlId", getUrlId())
                .append("controllerId", getControllerId())
                .append("requestUrl", getRequestUrl())
                .append("methodName", getMethodName())
                .append("methodType", getMethodType())
                .append("methodContentType", getMethodContentType())
                .append("requestParamMap", getRequestParamMap())
                .append("returnParamClass", getReturnParamClass())
                .append("returnParamMap", getReturnParamMap())
                .append("urlStatus", getUrlStatus())
                .append("urlLabel", getUrlLabel())
                .append("methodDesc", getMethodDesc())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .append("delFlag", getDelFlag())
                .toString();
    }
}
