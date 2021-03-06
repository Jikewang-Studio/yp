package com.bean;

public class User {
    ////用户表Id
    private Long userId;
    //用户姓名
    private String userName;
    //密码
    private String password;
    //用户头像地址
    private String userImgUrl;
    //电话
    private String phoneNumber;
    //用户邮箱
    private String email;
    //是否是摄影师;1是;0不是
    private Integer userStatus;
    //是摄影师的话，对应的摄影师ID
    private Long photographerId;
    //拍摄成功次数
    private Integer userSuccessTimes;

    //对象的构造方法，无参，有参
    public User() {
    }

    public User(String userName, String password, String phoneNumber, String email) {
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //对象的toString方法


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    //对象的get,set方法
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserImgUrl() {
        return userImgUrl;
    }

    public void setUserImgUrl(String userImgUrl) {
        this.userImgUrl = userImgUrl == null ? null : userImgUrl.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Long getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(Long photographerId) {
        this.photographerId = photographerId;
    }

    public Integer getUserSuccessTimes() {
        return userSuccessTimes;
    }

    public void setUserSuccessTimes(Integer userSuccessTimes) {
        this.userSuccessTimes = userSuccessTimes;
    }
}