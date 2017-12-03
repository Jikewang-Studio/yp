package com.bean;

import java.util.Date;

public class Works {
    private Long worksId;

    private String worksDescription;

    private String worksImgUrl;

    private Long photographerId;

    private String worksStyle;

    private Date worksCreate;

    public Long getWorksId() {
        return worksId;
    }

    public void setWorksId(Long worksId) {
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

    public Long getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(Long photographerId) {
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
}