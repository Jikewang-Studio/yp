package com.bean;

import java.util.Date;

public class P_to_u_message {
    //摄影师回复用户的留言表Id
    private Integer userMessageId;

    //摄影师给用户留言的内容
    private String userMessageContent;

    //用户Id
    private Integer userId;

    //摄影师ID
    private Integer photographerId;

    //创建时间
    private Date messageCreate;

    //摄影师名字
    private String photographerName;

    //对象的toString方法
    @Override
    public String toString() {
        return "P_to_u_message{" +
                "userMessageContent='" + userMessageContent + '\'' +
                ", messageCreate=" + messageCreate +
                ", photographerName='" + photographerName + '\'' +
                '}';
    }

    //属性的get，set方法
    public Integer getUserMessageId() {
        return userMessageId;
    }

    public void setUserMessageId(Integer userMessageId) {
        this.userMessageId = userMessageId;
    }

    public String getUserMessageContent() {
        return userMessageContent;
    }

    public void setUserMessageContent(String userMessageContent) {
        this.userMessageContent = userMessageContent == null ? null : userMessageContent.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(Integer photographerId) {
        this.photographerId = photographerId;
    }

    public Date getMessageCreate() {
        return messageCreate;
    }

    public void setMessageCreate(Date messageCreate) {
        this.messageCreate = messageCreate;
    }

    public String getPhotographerName() {
        return photographerName;
    }

    public void setPhotographerName(String photographerName) {
        this.photographerName = photographerName == null ? null : photographerName.trim();
    }
}