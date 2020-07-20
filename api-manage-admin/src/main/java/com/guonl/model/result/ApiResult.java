package com.guonl.model.result;

/**
 * Created by guonl
 * Date 2020/7/19 6:08 PM
 * Description:
 */
public class ApiResult<T> {
    private Integer code;
    private String errMsg;
    private T data;
}
