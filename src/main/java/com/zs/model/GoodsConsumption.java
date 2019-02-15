package com.zs.model;

import java.util.Date;

public class GoodsConsumption {
    private Integer recordId;

    private Integer memberId;

    private String employeeId;

    private Integer shopId;

    private Date consumptionDate;

    private Double consumptionTotalmoney;

    private Double consumptionCardbalance;

    private Double consumptionBankcard;

    private Double consumptionWechat;

    private Double consumptionAlipay;

    private Integer memberTotalscore;

    private Double employeeTotalbonus;

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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getConsumptionDate() {
        return consumptionDate;
    }

    public void setConsumptionDate(Date consumptionDate) {
        this.consumptionDate = consumptionDate;
    }

    public Double getConsumptionTotalmoney() {
        return consumptionTotalmoney;
    }

    public void setConsumptionTotalmoney(Double consumptionTotalmoney) {
        this.consumptionTotalmoney = consumptionTotalmoney;
    }

    public Double getConsumptionCardbalance() {
        return consumptionCardbalance;
    }

    public void setConsumptionCardbalance(Double consumptionCardbalance) {
        this.consumptionCardbalance = consumptionCardbalance;
    }

    public Double getConsumptionBankcard() {
        return consumptionBankcard;
    }

    public void setConsumptionBankcard(Double consumptionBankcard) {
        this.consumptionBankcard = consumptionBankcard;
    }

    public Double getConsumptionWechat() {
        return consumptionWechat;
    }

    public void setConsumptionWechat(Double consumptionWechat) {
        this.consumptionWechat = consumptionWechat;
    }

    public Double getConsumptionAlipay() {
        return consumptionAlipay;
    }

    public void setConsumptionAlipay(Double consumptionAlipay) {
        this.consumptionAlipay = consumptionAlipay;
    }

    public Integer getMemberTotalscore() {
        return memberTotalscore;
    }

    public void setMemberTotalscore(Integer memberTotalscore) {
        this.memberTotalscore = memberTotalscore;
    }

    public Double getEmployeeTotalbonus() {
        return employeeTotalbonus;
    }

    public void setEmployeeTotalbonus(Double employeeTotalbonus) {
        this.employeeTotalbonus = employeeTotalbonus;
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