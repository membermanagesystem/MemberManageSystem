package com.zs.model;

import java.util.Date;

public class ColumnAuth {
    private Integer columnAuthid;

    private Integer columuId;

    private Integer shopId;

    private Integer departmentId;

    private Integer positionId;

    private Integer columnAuthstate;

    private String remarks;

    private String operation;

    private Date operationDate;

    private String operationIp;

    public Integer getColumnAuthid() {
        return columnAuthid;
    }

    public void setColumnAuthid(Integer columnAuthid) {
        this.columnAuthid = columnAuthid;
    }

    public Integer getColumuId() {
        return columuId;
    }

    public void setColumuId(Integer columuId) {
        this.columuId = columuId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getColumnAuthstate() {
        return columnAuthstate;
    }

    public void setColumnAuthstate(Integer columnAuthstate) {
        this.columnAuthstate = columnAuthstate;
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