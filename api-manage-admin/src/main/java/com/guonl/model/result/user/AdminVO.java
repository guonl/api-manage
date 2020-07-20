package com.guonl.model.result.user;

/**
 * Created by guonl
 * Date 2020/7/19 6:07 PM
 * Description:
 */
public class AdminVO extends SimpleUser{

    private String password; //密码

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
