package com.zs.model;

import java.util.Date;

public class GiftConsumptionDetail {
    private Integer recordId;

    private Integer memberId;

    private Integer employeeId;

    private Integer shopId;

    private Integer giftId;

    private Integer giftNumber;

    private Double giftUnitprice;

    private Double giftTobalmoney;

    private Double giftScore;

    private Date giftConsumptiondate;

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

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public Integer getGiftNumber() {
        return giftNumber;
    }

    public void setGiftNumber(Integer giftNumber) {
        this.giftNumber = giftNumber;
    }

    public Double getGiftUnitprice() {
        return giftUnitprice;
    }

    public void setGiftUnitprice(Double giftUnitprice) {
        this.giftUnitprice = giftUnitprice;
    }

    public Double getGiftTobalmoney() {
        return giftTobalmoney;
    }

    public void setGiftTobalmoney(Double giftTobalmoney) {
        this.giftTobalmoney = giftTobalmoney;
    }

    public Double getGiftScore() {
        return giftScore;
    }

    public void setGiftScore(Double giftScore) {
        this.giftScore = giftScore;
    }

    public Date getGiftConsumptiondate() {
        return giftConsumptiondate;
    }

    public void setGiftConsumptiondate(Date giftConsumptiondate) {
        this.giftConsumptiondate = giftConsumptiondate;
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