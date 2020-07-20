package com.guonl.model;

import java.io.Serializable;

/**
 * Created by guonl
 * Date 2020/7/19 6:08 PM
 * Description:
 */
public class FrontResult<T> implements Serializable {

    // 结果信息 0:成功
    private Integer code = 0;

    // 错误信息
    private String message = "请求成功";

    // 具体数据
    private T data = null;

    public FrontResult() {
    }

    public FrontResult(Integer errorCode, String errorMsg) {
        this.code = errorCode;
        this.message = errorMsg;
    }

    public FrontResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }



    public Integer getCode() {
        return code;
    }

    public void setCode(Integer errorCode) {
        this.code = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String errorMsg) {
        this.message = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> FrontResult<T> success(T data) {
        FrontResult<T> frontResult = new FrontResult<T>();
        frontResult.setData(data);
        return frontResult;
    }

    public static <T> FrontResult<T> error(int code, String message) {
        return new FrontResult<>(code, message);
    }

    public static <T> FrontResult<T> success(int code, String message, T data) {
        FrontResult<T> frontResult = new FrontResult<>(code, message);
        frontResult.setData(data);
        return frontResult;
    }


}
