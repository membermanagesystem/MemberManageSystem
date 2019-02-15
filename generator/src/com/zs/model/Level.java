package com.zs.model;

import java.util.Date;

public class Level {
    private Integer levelId;

    private String levalName;

    private Double levalDiscount;

    private String remarks;

    private String operation;

    private Date operationDate;

    private String operationIp;

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getLevalName() {
        return levalName;
    }

    public void setLevalName(String levalName) {
        this.levalName = levalName == null ? null : levalName.trim();
    }

    public Double getLevalDiscount() {
        return levalDiscount;
    }

    public void setLevalDiscount(Double levalDiscount) {
        this.levalDiscount = levalDiscount;
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