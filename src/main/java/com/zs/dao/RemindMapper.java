package com.zs.dao;

import com.zs.model.Remind;

public interface RemindMapper {
    int deleteByPrimaryKey(Integer remindId);

    int insert(Remind record);

    int insertSelective(Remind record);

    Remind selectByPrimaryKey(Integer remindId);

    int updateByPrimaryKeySelective(Remind record);

    int updateByPrimaryKey(Remind record);
}