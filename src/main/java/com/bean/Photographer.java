package com.bean;

public class Photographer {
    //摄影师Id
    private int photographerId;

    //摄影师姓名
    private String photographerName;

    //摄影师头像ID
    private String photographerImgUrl;

    //摄影师价格
    private Integer price;

    //摄影师性别
    private String sex;

    //摄影师身份证号
    private String idNumber;

    //摄影师所属用户Id
    private Long userId;

    //摄影师成功单数
    private Integer photographerSuccessTimes;

    //摄影师状态码
    private int photographerState;

    //摄影师简介
    private String photographerIntro;

    public int getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(int photographerId) {
        this.photographerId = photographerId;
    }

    public String getPhotographerName() {
        return photographerName;
    }

    public void setPhotographerName(String photographerName) {
        this.photographerName = photographerName;
    }

    public String getPhotographerImgUrl() {
        return photographerImgUrl;
    }

    public void setPhotographerImgUrl(String photographerImgUrl) {
        this.photographerImgUrl = photographerImgUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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

    public int getPhotographerState() {
        return photographerState;
    }

    public void setPhotographerState(int photographerState) {
        this.photographerState = photographerState;
    }

    public String getPhotographerIntro() {
        return photographerIntro;
    }

    public void setPhotographerIntro(String photographerIntro) {
        this.photographerIntro = photographerIntro;
    }
}