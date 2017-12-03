package com.bean;

public class Custom_made {
    //用户定制表ID
    private Long customMadeId;

    //学院名称
    private String collegeName;

    //班级名称
    private String className;

    //人数
    private Integer peopleQuantity;

    //联系人姓名
    private String contactName;

   //联系人电话
    private String contactPhoneNumber;

   //附加信息
    private String extraInformation;

  //0表示A类定制，1；表示B类定制；2表示明信片定制;5代表已经处理
    private Integer customType;

    public Custom_made() {
    }

    public Custom_made(Long customMadeId, String collegeName, String className, Integer peopleQuantity, String contactName, String contactPhoneNumber, String extraInformation, Integer customType) {
        this.customMadeId = customMadeId;
        this.collegeName = collegeName;
        this.className = className;
        this.peopleQuantity = peopleQuantity;
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.extraInformation = extraInformation;
        this.customType = customType;
    }

    @Override
    public String toString() {
        return "Custom_made{" +
                "customMadeId=" + customMadeId +
                ", collegeName='" + collegeName + '\'' +
                ", className='" + className + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                ", contactName='" + contactName + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", extraInformation='" + extraInformation + '\'' +
                ", customType=" + customType +
                '}';
    }

    public Long getCustomMadeId() {
        return customMadeId;
    }

    public void setCustomMadeId(Long customMadeId) {
        this.customMadeId = customMadeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getPeopleQuantity() {
        return peopleQuantity;
    }

    public void setPeopleQuantity(Integer peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber == null ? null : contactPhoneNumber.trim();
    }

    public String getExtraInformation() {
        return extraInformation;
    }

    public void setExtraInformation(String extraInformation) {
        this.extraInformation = extraInformation == null ? null : extraInformation.trim();
    }

    public Integer getCustomType() {
        return customType;
    }

    public void setCustomType(Integer customType) {
        this.customType = customType;
    }
}