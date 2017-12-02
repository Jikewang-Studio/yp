package com.bean;

import java.util.Date;

public class U_to_p_message {
    private Long photographerMessageId;

    private String photographerMessageContent;

    private Long userId;

    private Long photographerId;

    private Date messageCreate;

    private String userName;

    @Override
    public String toString() {
        return "U_to_p_message{" +
                "photographerMessageContent='" + photographerMessageContent + '\'' +
                ", messageCreate=" + messageCreate +
                ", userName='" + userName + '\'' +
                '}';
    }

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
        System.out.println("get photographerId");
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