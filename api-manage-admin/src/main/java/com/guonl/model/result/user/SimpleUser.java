package com.guonl.model.result.user;

/**
 * Created by guonl
 * Date 2020/7/19 6:07 PM
 * Description:
 */
public class SimpleUser {

    private String userId; //用户id

    private String userName; //用户名

    private String ignore; //忽略字段

    private SimpleUser friend; //忽略字段

    public SimpleUser getFriend() {
        return friend;
    }

    public void setFriend(SimpleUser friend) {
        this.friend = friend;
    }

    public String getIgnore() {
        return ignore;
    }

    public void setIgnore(String ignore) {
        this.ignore = ignore;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
