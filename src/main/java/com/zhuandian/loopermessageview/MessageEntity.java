package com.zhuandian.loopermessageview;

/**
 * desc :消息实体
 * author：xiedong
 * data：2018/7/20
 */
public class MessageEntity {
    private String message;
    private int imgRes;


    public MessageEntity(int imgRes, String message) {
        this.message = message;
        this.imgRes = imgRes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }
}
