package com.zs.model;

import java.util.Date;

public class Position {
    private Integer positionId;

    private Integer departmentId;

    private Integer shopId;

    private String positionName;

    private Integer positonDescription;

    private Integer positonStatus;

    private String remarks;

    private String operation;

    private Date operationDate;

    private String operationIp;

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public Integer getPositonDescription() {
        return positonDescription;
    }

    public void setPositonDescription(Integer positonDescription) {
        this.positonDescription = positonDescription;
    }

    public Integer getPositonStatus() {
        return positonStatus;
    }

    public void setPositonStatus(Integer positonStatus) {
        this.positonStatus = positonStatus;
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