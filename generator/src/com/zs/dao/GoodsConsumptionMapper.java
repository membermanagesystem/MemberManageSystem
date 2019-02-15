package com.zs.dao;

import com.zs.model.GoodsConsumption;

public interface GoodsConsumptionMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(GoodsConsumption record);

    int insertSelective(GoodsConsumption record);

    GoodsConsumption selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(GoodsConsumption record);

    int updateByPrimaryKey(GoodsConsumption record);
}