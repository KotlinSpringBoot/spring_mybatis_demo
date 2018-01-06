package com.easy.springboot.service.impl;

import com.easy.springboot.dao.UserMapper;
import com.easy.springboot.model.User;
import com.easy.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> listAll() {
        return userMapper.listAll();
    }
}
