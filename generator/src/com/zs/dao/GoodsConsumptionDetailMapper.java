package com.zs.dao;

import com.zs.model.GoodsConsumptionDetail;

public interface GoodsConsumptionDetailMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(GoodsConsumptionDetail record);

    int insertSelective(GoodsConsumptionDetail record);

    GoodsConsumptionDetail selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(GoodsConsumptionDetail record);

    int updateByPrimaryKey(GoodsConsumptionDetail record);
}