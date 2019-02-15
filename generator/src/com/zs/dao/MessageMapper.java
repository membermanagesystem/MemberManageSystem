package com.zs.dao;

import com.zs.model.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}