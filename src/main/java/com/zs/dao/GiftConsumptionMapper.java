package com.zs.dao;

import com.zs.model.GiftConsumption;

public interface GiftConsumptionMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(GiftConsumption record);

    int insertSelective(GiftConsumption record);

    GiftConsumption selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(GiftConsumption record);

    int updateByPrimaryKey(GiftConsumption record);
}