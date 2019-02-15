package com.zs.dao;

import com.zs.model.GiftStorage;

public interface GiftStorageMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(GiftStorage record);

    int insertSelective(GiftStorage record);

    GiftStorage selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(GiftStorage record);

    int updateByPrimaryKey(GiftStorage record);
}