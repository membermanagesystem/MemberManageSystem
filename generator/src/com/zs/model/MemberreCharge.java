package com.zs.model;

import java.util.Date;

public class MemberreCharge {
    private Integer recordId;

    private String memberId;

    private Double memberRecharge;

    private Integer memberRechargetype;

    private Date memberRechargetime;

    private String remarks;

    private String operation;

    private Date operationDate;

    private String operationIp;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public Double getMemberRecharge() {
        return memberRecharge;
    }

    public void setMemberRecharge(Double memberRecharge) {
        this.memberRecharge = memberRecharge;
    }

    public Integer getMemberRechargetype() {
        return memberRechargetype;
    }

    public void setMemberRechargetype(Integer memberRechargetype) {
        this.memberRechargetype = memberRechargetype;
    }

    public Date getMemberRechargetime() {
        return memberRechargetime;
    }

    public void setMemberRechargetime(Date memberRechargetime) {
        this.memberRechargetime = memberRechargetime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
}