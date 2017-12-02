package com.bean;

public class Photographer {
    private Long photographerId;

    private String photographerName;

    private String photographerImgUrl;

    private Double price;

    private String gender;

    private String idNumber;

    private Long userId;

    private Integer photographerSuccessTimes;

    private Integer photographerState;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPhotographerSuccessTimes() {
        return photographerSuccessTimes;
    }

    public void setPhotographerSuccessTimes(Integer photographerSuccessTimes) {
        this.photographerSuccessTimes = photographerSuccessTimes;
    }

    public Integer getPhotographerState() {
        return photographerState;
    }

    public void setPhotographerState(Integer photographerState) {
        this.photographerState = photographerState;
    }
}