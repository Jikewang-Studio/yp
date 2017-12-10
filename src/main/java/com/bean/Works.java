package com.bean;

import java.util.Date;

public class Works {
    //摄影师作品集表
    private Integer worksId;

    //作品描述
    private String worksDescription;

    //作品存放地址
    private String worksImgUrl;

    //作品对应的摄影师ID
    private Integer photographerId;

    //作品类型;(你选择可以固定有哪几种类型)
    private String worksStyle;

    //作品创建时间
    private Date worksCreate;

    //作品集中图片Id
    private Integer workPhotoId;

    //图片状态(0表示被删除,1表示正常)
    private Integer workPhotoState;

    public Integer getWorksId() {
        return worksId;
    }

    public void setWorksId(Integer worksId) {
        this.worksId = worksId;
    }

    public String getWorksDescription() {
        return worksDescription;
    }

    public void setWorksDescription(String worksDescription) {
        this.worksDescription = worksDescription == null ? null : worksDescription.trim();
    }

    public String getWorksImgUrl() {
        return worksImgUrl;
    }

    public void setWorksImgUrl(String worksImgUrl) {
        this.worksImgUrl = worksImgUrl == null ? null : worksImgUrl.trim();
    }

    public Integer getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(Integer photographerId) {
        this.photographerId = photographerId;
    }

    public String getWorksStyle() {
        return worksStyle;
    }

    public void setWorksStyle(String worksStyle) {
        this.worksStyle = worksStyle == null ? null : worksStyle.trim();
    }

    public Date getWorksCreate() {
        return worksCreate;
    }

    public void setWorksCreate(Date worksCreate) {
        this.worksCreate = worksCreate;
    }

    public Integer getWorkPhotoId() {
        return workPhotoId;
    }

    public void setWorkPhotoId(Integer workPhotoId) {
        this.workPhotoId = workPhotoId;
    }

    public Integer getWorkPhotoState() {
        return workPhotoState;
    }

    public void setWorkPhotoState(Integer workPhotoState) {
        this.workPhotoState = workPhotoState;
    }
}