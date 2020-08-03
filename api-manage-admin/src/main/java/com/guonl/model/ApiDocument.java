package com.guonl.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by guonl
 * Date 2020/8/3 10:21 PM
 * Description:
 */
@Data
public class ApiDocument {

    private int id;                     // 接口ID
    private int projectId;              // 项目ID
    private int groupId;                // 分组ID
    private String name;                // 接口名称
    private int status;                 // 状态：0-启用、1-维护、2-废弃
    private int starLevel;              // 星标等级：0-普通接口、1-一星接口
    private String requestUrl;          // Request URL：相对地址
    private String requestMethod;       // Request Method：如POST、GET
    private String requestHeaders;      // Request Headers：Map-JSON格式字符串
    private String queryParams;         // Query String Parameters：VO-JSON格式字符串
    private int responseDatatypeId;     // 响应数据类型ID
    private String responseParams;      // Response Parameters：VO-JSON格式字符串
    private String successRespType;     // Response Content-type：成功接口，如JSON、XML、HTML、TEXT
    private String successRespExample;  // Response Content：成功接口
    private String failRespType;        // Response Content-type：失败接口
    private String failRespExample;     // Response Content：失败接口
    private String remark;              // 备注
    private Date addTime;               // 创建时间
    private Date updateTime;            // 更新时间


}
