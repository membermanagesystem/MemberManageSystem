package com.zs.model;

import java.util.Date;

public class Member {
    private Integer memberId;

    private String memberCardnum;

    private String memberName;

    private Integer memberGender;

    private String memberIdnum;

    private String memberPhone;

    private Date memberBirthday;

    private Integer memberStatus;

    private Integer memberTotalscore;

    private Integer memberLeavescore;

    private Double memberTotalmoney;

    private Double memberLeavemoney;

    private Double memberCardbalance;

    private String memberEmail;

    private String memberAdress;

    private Integer levelId;

    private Integer shopId;

    private Date memberCarddate;

    private Date memberOutcarddate;

    private Integer memberAge;

    private Double memberHeight;

    private Double memberWidth;

    private String memberStyle;

    private String memberIntroductor;

    private String memberInterest;

    private String operation;

    private Date operationDate;

    private String operationIp;

    private String remarks;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberCardnum() {
        return memberCardnum;
    }

    public void setMemberCardnum(String memberCardnum) {
        this.memberCardnum = memberCardnum == null ? null : memberCardnum.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public Integer getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(Integer memberGender) {
        this.memberGender = memberGender;
    }

    public String getMemberIdnum() {
        return memberIdnum;
    }

    public void setMemberIdnum(String memberIdnum) {
        this.memberIdnum = memberIdnum == null ? null : memberIdnum.trim();
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone == null ? null : memberPhone.trim();
    }

    public Date getMemberBirthday() {
        return memberBirthday;
    }

    public void setMemberBirthday(Date memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public Integer getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(Integer memberStatus) {
        this.memberStatus = memberStatus;
    }

    public Integer getMemberTotalscore() {
        return memberTotalscore;
    }

    public void setMemberTotalscore(Integer memberTotalscore) {
        this.memberTotalscore = memberTotalscore;
    }

    public Integer getMemberLeavescore() {
        return memberLeavescore;
    }

    public void setMemberLeavescore(Integer memberLeavescore) {
        this.memberLeavescore = memberLeavescore;
    }

    public Double getMemberTotalmoney() {
        return memberTotalmoney;
    }

    public void setMemberTotalmoney(Double memberTotalmoney) {
        this.memberTotalmoney = memberTotalmoney;
    }

    public Double getMemberLeavemoney() {
        return memberLeavemoney;
    }

    public void setMemberLeavemoney(Double memberLeavemoney) {
        this.memberLeavemoney = memberLeavemoney;
    }

    public Double getMemberCardbalance() {
        return memberCardbalance;
    }

    public void setMemberCardbalance(Double memberCardbalance) {
        this.memberCardbalance = memberCardbalance;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public String getMemberAdress() {
        return memberAdress;
    }

    public void setMemberAdress(String memberAdress) {
        this.memberAdress = memberAdress == null ? null : memberAdress.trim();
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getMemberCarddate() {
        return memberCarddate;
    }

    public void setMemberCarddate(Date memberCarddate) {
        this.memberCarddate = memberCarddate;
    }

    public Date getMemberOutcarddate() {
        return memberOutcarddate;
    }

    public void setMemberOutcarddate(Date memberOutcarddate) {
        this.memberOutcarddate = memberOutcarddate;
    }

    public Integer getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }

    public Double getMemberHeight() {
        return memberHeight;
    }

    public void setMemberHeight(Double memberHeight) {
        this.memberHeight = memberHeight;
    }

    public Double getMemberWidth() {
        return memberWidth;
    }

    public void setMemberWidth(Double memberWidth) {
        this.memberWidth = memberWidth;
    }

    public String getMemberStyle() {
        return memberStyle;
    }

    public void setMemberStyle(String memberStyle) {
        this.memberStyle = memberStyle == null ? null : memberStyle.trim();
    }

    public String getMemberIntroductor() {
        return memberIntroductor;
    }

    public void setMemberIntroductor(String memberIntroductor) {
        this.memberIntroductor = memberIntroductor == null ? null : memberIntroductor.trim();
    }

    public String getMemberInterest() {
        return memberInterest;
    }

    public void setMemberInterest(String memberInterest) {
        this.memberInterest = memberInterest == null ? null : memberInterest.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public String getOperationIp() {
        return operationIp;
    }

    public void setOperationIp(String operationIp) {
        this.operationIp = operationIp == null ? null : operationIp.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}