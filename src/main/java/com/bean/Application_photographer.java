package com.bean;

public class Application_photographer {
    private Long applicationFormId;

    private String applicationPhotographerName;

    private String applicationPhotographerGender;

    private Integer applicationIdNumber;

    private String applicationWorksUrl;

    private Long userId;

    private Integer applicationStutas;

    public Long getApplicationFormId() {
        return applicationFormId;
    }

    public void setApplicationFormId(Long applicationFormId) {
        this.applicationFormId = applicationFormId;
    }

    public String getApplicationPhotographerName() {
        return applicationPhotographerName;
    }

    public void setApplicationPhotographerName(String applicationPhotographerName) {
        this.applicationPhotographerName = applicationPhotographerName == null ? null : applicationPhotographerName.trim();
    }

    public String getApplicationPhotographerGender() {
        return applicationPhotographerGender;
    }

    public void setApplicationPhotographerGender(String applicationPhotographerGender) {
        this.applicationPhotographerGender = applicationPhotographerGender == null ? null : applicationPhotographerGender.trim();
    }

    public Integer getApplicationIdNumber() {
        return applicationIdNumber;
    }

    public void setApplicationIdNumber(Integer applicationIdNumber) {
        this.applicationIdNumber = applicationIdNumber;
    }

    public String getApplicationWorksUrl() {
        return applicationWorksUrl;
    }

    public void setApplicationWorksUrl(String applicationWorksUrl) {
        this.applicationWorksUrl = applicationWorksUrl == null ? null : applicationWorksUrl.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getApplicationStutas() {
        return applicationStutas;
    }

    public void setApplicationStutas(Integer applicationStutas) {
        this.applicationStutas = applicationStutas;
    }
}