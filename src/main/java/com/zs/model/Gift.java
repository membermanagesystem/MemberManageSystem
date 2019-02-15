package com.zs.model;

import java.util.Date;

public class Gift {
    private Integer giftId;

    private String giftCode;

    private String giftName;

    private Integer giftCategory;

    private Integer shopId;

    private Integer giftMetering;

    private Integer giftScore;

    private String giftImage;

    private Double giftCostprice;

    private Integer giftNumber;

    private Integer giftLevelnumber;

    private Date giftProductiondate;

    private Date giftOutproductiondate;

    private String giftLocation;

    private Integer giftStatus;

    private String remarks;

    private String operation;

    private Date operationDate;

    private String operationIp;

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getGiftCode() {
        return giftCode;
    }

    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode == null ? null : giftCode.trim();
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName == null ? null : giftName.trim();
    }

    public Integer getGiftCategory() {
        return giftCategory;
    }

    public void setGiftCategory(Integer giftCategory) {
        this.giftCategory = giftCategory;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getGiftMetering() {
        return giftMetering;
    }

    public void setGiftMetering(Integer giftMetering) {
        this.giftMetering = giftMetering;
    }

    public Integer getGiftScore() {
        return giftScore;
    }

    public void setGiftScore(Integer giftScore) {
        this.giftScore = giftScore;
    }

    public String getGiftImage() {
        return giftImage;
    }

    public void setGiftImage(String giftImage) {
        this.giftImage = giftImage == null ? null : giftImage.trim();
    }

    public Double getGiftCostprice() {
        return giftCostprice;
    }

    public void setGiftCostprice(Double giftCostprice) {
        this.giftCostprice = giftCostprice;
    }

    public Integer getGiftNumber() {
        return giftNumber;
    }

    public void setGiftNumber(Integer giftNumber) {
        this.giftNumber = giftNumber;
    }

    public Integer getGiftLevelnumber() {
        return giftLevelnumber;
    }

    public void setGiftLevelnumber(Integer giftLevelnumber) {
        this.giftLevelnumber = giftLevelnumber;
    }

    public Date getGiftProductiondate() {
        return giftProductiondate;
    }

    public void setGiftProductiondate(Date giftProductiondate) {
        this.giftProductiondate = giftProductiondate;
    }

    public Date getGiftOutproductiondate() {
        return giftOutproductiondate;
    }

    public void setGiftOutproductiondate(Date giftOutproductiondate) {
        this.giftOutproductiondate = giftOutproductiondate;
    }

    public String getGiftLocation() {
        return giftLocation;
    }

    public void setGiftLocation(String giftLocation) {
        this.giftLocation = giftLocation == null ? null : giftLocation.trim();
    }

    public Integer getGiftStatus() {
        return giftStatus;
    }

    public void setGiftStatus(Integer giftStatus) {
        this.giftStatus = giftStatus;
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