package com.laonong.member.model;

import java.util.Date;

public class MemberUser extends BaseEntity{

    private String memberName;

    private String memberPassword;

    private String phoneNumber;

    private Long recommenderId;

    private Long memberTypeId;

    private String memberCardNumber;

    private Boolean sex;

    private String birthday;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword == null ? null : memberPassword.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Long getRecommenderId() {
        return recommenderId;
    }

    public void setRecommenderId(Long recommenderId) {
        this.recommenderId = recommenderId;
    }

    public Long getMemberTypeId() {
        return memberTypeId;
    }

    public void setMemberTypeId(Long memberTypeId) {
        this.memberTypeId = memberTypeId;
    }

    public String getMemberCardNumber() {
        return memberCardNumber;
    }

    public void setMemberCardNumber(String memberCardNumber) {
        this.memberCardNumber = memberCardNumber == null ? null : memberCardNumber.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

}