package com.zs.dao;

import com.zs.model.MemberreCharge;

public interface MemberreChargeMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(MemberreCharge record);

    int insertSelective(MemberreCharge record);

    MemberreCharge selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(MemberreCharge record);

    int updateByPrimaryKey(MemberreCharge record);
}