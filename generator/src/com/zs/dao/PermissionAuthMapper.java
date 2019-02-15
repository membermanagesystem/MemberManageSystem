package com.zs.dao;

import com.zs.model.PermissionAuth;

public interface PermissionAuthMapper {
    int deleteByPrimaryKey(Integer permissionAuthid);

    int insert(PermissionAuth record);

    int insertSelective(PermissionAuth record);

    PermissionAuth selectByPrimaryKey(Integer permissionAuthid);

    int updateByPrimaryKeySelective(PermissionAuth record);

    int updateByPrimaryKey(PermissionAuth record);
}