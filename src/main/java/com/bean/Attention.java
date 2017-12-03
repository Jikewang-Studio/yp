package com.bean;

public class Attention {
    //用户关注表ID
    private Long attentionId;

    //用户ID
    private String uerId;

    //关注的摄影师ID
    private String attentionPhotographerId;

    public Long getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(Long attentionId) {
        this.attentionId = attentionId;
    }

    public String getUerId() {
        return uerId;
    }

    public void setUerId(String uerId) {
        this.uerId = uerId == null ? null : uerId.trim();
    }

    public String getAttentionPhotographerId() {
        return attentionPhotographerId;
    }

    public void setAttentionPhotographerId(String attentionPhotographerId) {
        this.attentionPhotographerId = attentionPhotographerId == null ? null : attentionPhotographerId.trim();
    }
}