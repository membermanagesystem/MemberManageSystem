package com.zs.model;

import java.util.Date;

public class Remind {
    private Integer remindId;

    private Integer remindNumber;

    private Integer shopId;

    private String remindTitle;

    private String remindText;

    private Integer remindLevel;

    private String remarks;

    private String operation;

    private Date operationDate;

    private String operationIp;

    public Integer getRemindId() {
        return remindId;
    }

    public void setRemindId(Integer remindId) {
        this.remindId = remindId;
    }

    public Integer getRemindNumber() {
        return remindNumber;
    }

    public void setRemindNumber(Integer remindNumber) {
        this.remindNumber = remindNumber;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getRemindTitle() {
        return remindTitle;
    }

    public void setRemindTitle(String remindTitle) {
        this.remindTitle = remindTitle == null ? null : remindTitle.trim();
    }

    public String getRemindText() {
        return remindText;
    }

    public void setRemindText(String remindText) {
        this.remindText = remindText == null ? null : remindText.trim();
    }

    public Integer getRemindLevel() {
        return remindLevel;
    }

    public void setRemindLevel(Integer remindLevel) {
        this.remindLevel = remindLevel;
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