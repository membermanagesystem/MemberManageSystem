package com.zs.model;

import java.util.Date;

public class Column {
    private Integer columnId;

    private String columnName;

    private String columnUrl;

    private String columnUpperlevel;

    private Integer columuLevel;

    private Integer columuRank;

    private Integer columuStatus;

    private String remarks;

    private String operation;

    private Date operationDate;

    private String operationIp;

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    public String getColumnUrl() {
        return columnUrl;
    }

    public void setColumnUrl(String columnUrl) {
        this.columnUrl = columnUrl == null ? null : columnUrl.trim();
    }

    public String getColumnUpperlevel() {
        return columnUpperlevel;
    }

    public void setColumnUpperlevel(String columnUpperlevel) {
        this.columnUpperlevel = columnUpperlevel == null ? null : columnUpperlevel.trim();
    }

    public Integer getColumuLevel() {
        return columuLevel;
    }

    public void setColumuLevel(Integer columuLevel) {
        this.columuLevel = columuLevel;
    }

    public Integer getColumuRank() {
        return columuRank;
    }

    public void setColumuRank(Integer columuRank) {
        this.columuRank = columuRank;
    }

    public Integer getColumuStatus() {
        return columuStatus;
    }

    public void setColumuStatus(Integer columuStatus) {
        this.columuStatus = columuStatus;
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