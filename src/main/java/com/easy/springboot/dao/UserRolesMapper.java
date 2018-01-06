package com.easy.springboot.dao;

import com.easy.springboot.model.UserRolesKey;

public interface UserRolesMapper {
    int deleteByPrimaryKey(UserRolesKey key);

    int insert(UserRolesKey record);

    int insertSelective(UserRolesKey record);
}