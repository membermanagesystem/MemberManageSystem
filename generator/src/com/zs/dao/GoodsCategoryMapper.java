package com.zs.dao;

import com.zs.model.GoodsCategory;

public interface GoodsCategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(GoodsCategory record);

    int insertSelective(GoodsCategory record);

    GoodsCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(GoodsCategory record);

    int updateByPrimaryKey(GoodsCategory record);
}