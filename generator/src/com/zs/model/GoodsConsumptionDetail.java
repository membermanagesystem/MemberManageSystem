package com.zs.model;

import java.util.Date;

public class GoodsConsumptionDetail {
    private Integer recordId;

    private Integer memberId;

    private Integer employeeId;

    private Integer shopId;

    private Integer goodsId;

    private Integer goodsNumber;

    private Double goodsUnitprice;

    private Double goodsTobalmoney;

    private Double goodsScore;

    private Double employeeBonus;

    private Date goodsConsumptiondate;

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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Double getGoodsUnitprice() {
        return goodsUnitprice;
    }

    public void setGoodsUnitprice(Double goodsUnitprice) {
        this.goodsUnitprice = goodsUnitprice;
    }

    public Double getGoodsTobalmoney() {
        return goodsTobalmoney;
    }

    public void setGoodsTobalmoney(Double goodsTobalmoney) {
        this.goodsTobalmoney = goodsTobalmoney;
    }

    public Double getGoodsScore() {
        return goodsScore;
    }

    public void setGoodsScore(Double goodsScore) {
        this.goodsScore = goodsScore;
    }

    public Double getEmployeeBonus() {
        return employeeBonus;
    }

    public void setEmployeeBonus(Double employeeBonus) {
        this.employeeBonus = employeeBonus;
    }

    public Date getGoodsConsumptiondate() {
        return goodsConsumptiondate;
    }

    public void setGoodsConsumptiondate(Date goodsConsumptiondate) {
        this.goodsConsumptiondate = goodsConsumptiondate;
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