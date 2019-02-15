package com.zs.dao;

import com.zs.model.Gift;

public interface GiftMapper {
    int deleteByPrimaryKey(Integer giftId);

    int insert(Gift record);

    int insertSelective(Gift record);

    Gift selectByPrimaryKey(Integer giftId);

    int updateByPrimaryKeySelective(Gift record);

    int updateByPrimaryKey(Gift record);
}