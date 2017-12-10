package com.bean;

public class Attention {
    private Integer attentionId;

    private Integer uerId;

    private Integer photographerId;

    private String photographerName;

    private String photographerImgUrl;

    public Integer getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(Integer attentionId) {
        this.attentionId = attentionId;
    }

    public Integer getUerId() {
        return uerId;
    }

    public void setUerId(Integer uerId) {
        this.uerId = uerId;
    }

    public Integer getPhotographerId() {
        return photographerId;
    }

    public void setPhotographerId(Integer photographerId) {
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
}