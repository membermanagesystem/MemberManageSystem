package com.zs.model;

import java.util.Date;

public class Goods {
    private Integer goodsId;

    private String goodsCode;

    private String goodsName;

    private Integer categoryId;

    private Integer shopId;

    private Integer goodsMetering;

    private Integer goodsScore;

    private String goodsImage;

    private Double goodsBonus;

    private Double goodsCostprice;

    private Double goodsSaleprice;

    private Double goodsDiscount;

    private Integer goodsNumber;

    private Integer goodsLevelnumber;

    private Date goodsProductiondate;

    private Date goodsOutproductiondate;

    private String goodsLocation;

    private Integer goodsStatus;

    private String remarks;

    private String operation;

    private Date operationDate;

    private String operationIp;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getGoodsMetering() {
        return goodsMetering;
    }

    public void setGoodsMetering(Integer goodsMetering) {
        this.goodsMetering = goodsMetering;
    }

    public Integer getGoodsScore() {
        return goodsScore;
    }

    public void setGoodsScore(Integer goodsScore) {
        this.goodsScore = goodsScore;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public Double getGoodsBonus() {
        return goodsBonus;
    }

    public void setGoodsBonus(Double goodsBonus) {
        this.goodsBonus = goodsBonus;
    }

    public Double getGoodsCostprice() {
        return goodsCostprice;
    }

    public void setGoodsCostprice(Double goodsCostprice) {
        this.goodsCostprice = goodsCostprice;
    }

    public Double getGoodsSaleprice() {
        return goodsSaleprice;
    }

    public void setGoodsSaleprice(Double goodsSaleprice) {
        this.goodsSaleprice = goodsSaleprice;
    }

    public Double getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(Double goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getGoodsLevelnumber() {
        return goodsLevelnumber;
    }

    public void setGoodsLevelnumber(Integer goodsLevelnumber) {
        this.goodsLevelnumber = goodsLevelnumber;
    }

    public Date getGoodsProductiondate() {
        return goodsProductiondate;
    }

    public void setGoodsProductiondate(Date goodsProductiondate) {
        this.goodsProductiondate = goodsProductiondate;
    }

    public Date getGoodsOutproductiondate() {
        return goodsOutproductiondate;
    }

    public void setGoodsOutproductiondate(Date goodsOutproductiondate) {
        this.goodsOutproductiondate = goodsOutproductiondate;
    }

    public String getGoodsLocation() {
        return goodsLocation;
    }

    public void setGoodsLocation(String goodsLocation) {
        this.goodsLocation = goodsLocation == null ? null : goodsLocation.trim();
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
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