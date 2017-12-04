package com.bean;

import java.util.Date;

public class U_to_p_message {
    //用户给摄影师的留言表
    private Long photographerMessageId;

    //用户给摄影师留言的内容
    private String photographerMessageContent;

    //用户ID
    private Long userId;

    //摄影师ID
    private Long photographerId;

    //创建时间
    private Date messageCreate;

    //用户姓名
    private String userName;

    //对象的toString
    @Override
    public String toString() {
        return "U_to_p_message{" +
                "photographerMessageContent='" + photographerMessageContent + '\'' +
                ", messageCreate=" + messageCreate +
                ", userName='" + userName + '\'' +
                '}';
    }

    //属性的get和set方法
    public Long getPhotographerMessageId() {
        return photographerMessageId;
    }

    public void setPhotographerMessageId(Long photographerMessageId) {
        this.photographerMessageId = photographerMessageId;
    }

    public String getPhotographerMessageContent() {
        return photographerMessageContent;
    }

    public void setPhotographerMessageContent(String photographerMessageContent) {
        this.photographerMessageContent = photographerMessageContent == null ? null : photographerMessageContent.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(Long photographerId) {
        this.photographerId = photographerId;
    }

    public Date getMessageCreate() {
        return messageCreate;
    }

    public void setMessageCreate(Date messageCreate) {
        this.messageCreate = messageCreate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}