package com.bean;

public class Administrator {
    //管理员表ID
    private Integer administratorId;

   //管理员姓名
    private String administratorName;

  //管理员密码
    private String administratorPassword;

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getAdministratorName() {
        return administratorName;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName == null ? null : administratorName.trim();
    }

    public String getAdministratorPassword() {
        return administratorPassword;
    }

    public void setAdministratorPassword(String administratorPassword) {
        this.administratorPassword = administratorPassword == null ? null : administratorPassword.trim();
    }
}