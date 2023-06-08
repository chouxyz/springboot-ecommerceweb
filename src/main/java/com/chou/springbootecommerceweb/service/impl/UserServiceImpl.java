package com.chou.springbootecommerceweb.service.impl;

import com.chou.springbootecommerceweb.dao.UserDao;
import com.chou.springbootecommerceweb.dto.UserRegisterRequest;
import com.chou.springbootecommerceweb.model.User;
import com.chou.springbootecommerceweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
