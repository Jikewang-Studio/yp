package com.bean;

public class Photographer {
    private Long photographerId;

    private String photographerName;

    private String photographerImgUrl;

    private Integer price;

    private String gender;

    private String idNumber;

    private Long worksId;

    private Long userId;

    private Long attentionId;

    private Long orederId;

    private Integer photographerSuccessTimes;

    private Long photographerMessageId;

    public Long getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(Long photographerId) {
        this.photographerId = photographerId;
    }

    public String getPhotographerName() {
        return photographerName;
    }

    public void setPhotographerName(String photographerName) {
        this.photographerName = photographerName == null ? null : photographerName.trim();
    }

    public String getPhotographerImgUrl() {
        return photographerImgUrl;
    }

    public void setPhotographerImgUrl(String photographerImgUrl) {
        this.photographerImgUrl = photographerImgUrl == null ? null : photographerImgUrl.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Long getWorksId() {
        return worksId;
    }

    public void setWorksId(Long worksId) {
        this.worksId = worksId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(Long attentionId) {
        this.attentionId = attentionId;
    }

    public Long getOrederId() {
        return orederId;
    }

    public void setOrederId(Long orederId) {
        this.orederId = orederId;
    }

    public Integer getPhotographerSuccessTimes() {
        return photographerSuccessTimes;
    }

    public void setPhotographerSuccessTimes(Integer photographerSuccessTimes) {
        this.photographerSuccessTimes = photographerSuccessTimes;
    }

    public Long getPhotographerMessageId() {
        return photographerMessageId;
    }

    public void setPhotographerMessageId(Long photographerMessageId) {
        this.photographerMessageId = photographerMessageId;
    }
}