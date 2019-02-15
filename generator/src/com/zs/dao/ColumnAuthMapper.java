package com.zs.dao;

import com.zs.model.ColumnAuth;

public interface ColumnAuthMapper {
    int deleteByPrimaryKey(Integer columnAuthid);

    int insert(ColumnAuth record);

    int insertSelective(ColumnAuth record);

    ColumnAuth selectByPrimaryKey(Integer columnAuthid);

    int updateByPrimaryKeySelective(ColumnAuth record);

    int updateByPrimaryKey(ColumnAuth record);
}