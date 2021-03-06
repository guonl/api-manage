package com.guonl.model.result.book;


import com.guonl.model.result.user.UserVO;

/**
 * Created by guonl
 * Date 2020/7/19 6:07 PM
 * Description:
 */
public class BookDetailVO extends BookVO{

    private int storeCount; //馆藏数量
    private String[] pictures; //图片

    private UserVO owner;

    public int getStoreCount() {
        return storeCount;
    }

    public void setStoreCount(int storeCount) {
        this.storeCount = storeCount;
    }

    public String[] getPictures() {
        return pictures;
    }

    public void setPictures(String[] pictures) {
        this.pictures = pictures;
    }

    public UserVO getOwner() {
        return owner;
    }

    public void setOwner(UserVO owner) {
        this.owner = owner;
    }
}
