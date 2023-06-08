package com.chou.springbootecommerceweb.dao;

import com.chou.springbootecommerceweb.dto.UserRegisterRequest;
import com.chou.springbootecommerceweb.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest registerRequest);
}
