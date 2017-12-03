package com.bean;

import java.util.Date;

public class P_to_u_message {
    private Long userMessageId;

    private String userMessageContent;

    private Long userId;

    private Long photographerId;

    private Date messageCreate;

    private String photographerName;

    public Long getUserMessageId() {
        return userMessageId;
    }

    public void setUserMessageId(Long userMessageId) {
        this.userMessageId = userMessageId;
    }

    public String getUserMessageContent() {
        return userMessageContent;
    }

    public void setUserMessageContent(String userMessageContent) {
        this.userMessageContent = userMessageContent == null ? null : userMessageContent.trim();
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

    public String getPhotographerName() {
        return photographerName;
    }

    public void setPhotographerName(String photographerName) {
        this.photographerName = photographerName == null ? null : photographerName.trim();
    }
}