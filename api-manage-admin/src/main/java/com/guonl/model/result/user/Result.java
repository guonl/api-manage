package com.guonl.model.result.user;

import java.util.List;

/**
 * Created by guonl
 * Date 2020/7/19 6:07 PM
 * Description:
 */
public class Result<M,T extends Object> {
    private M message; //消息
    private List<T> list; //列表
}
