package com.zs.model;

import java.util.Date;

public class PermissionAuth {
    private Integer permissionAuthid;

    private Integer permissionId;

    private Integer shopId;

    private Integer departmentId;

    private Integer positionId;

    private Integer permissionAuthstate;

    private String remarks;

    private String operation;

    private Date operationDate;

    private String operationIp;

    public Integer getPermissionAuthid() {
        return permissionAuthid;
    }

    public void setPermissionAuthid(Integer permissionAuthid) {
        this.permissionAuthid = permissionAuthid;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
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

    public Integer getPermissionAuthstate() {
        return permissionAuthstate;
    }

    public void setPermissionAuthstate(Integer permissionAuthstate) {
        this.permissionAuthstate = permissionAuthstate;
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