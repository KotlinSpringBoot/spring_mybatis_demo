package com.easy.springboot.service.impl;

import com.easy.springboot.dao.RoleMapper;
import com.easy.springboot.model.Role;
import com.easy.springboot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> listAll() {
        return roleMapper.listAll();
    }
}
