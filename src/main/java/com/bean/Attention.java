package com.bean;

public class Attention {
    private Long attentionId;

    private String uerId;

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