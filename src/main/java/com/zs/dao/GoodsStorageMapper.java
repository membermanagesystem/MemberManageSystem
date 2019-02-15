package com.zs.dao;

import com.zs.model.GoodsStorage;

public interface GoodsStorageMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(GoodsStorage record);

    int insertSelective(GoodsStorage record);

    GoodsStorage selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(GoodsStorage record);

    int updateByPrimaryKey(GoodsStorage record);
}