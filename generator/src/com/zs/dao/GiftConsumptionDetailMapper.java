package com.zs.dao;

import com.zs.model.GiftConsumptionDetail;

public interface GiftConsumptionDetailMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(GiftConsumptionDetail record);

    int insertSelective(GiftConsumptionDetail record);

    GiftConsumptionDetail selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(GiftConsumptionDetail record);

    int updateByPrimaryKey(GiftConsumptionDetail record);
}