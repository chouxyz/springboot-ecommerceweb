package com.chou.springbootecommerceweb.service;

import com.chou.springbootecommerceweb.dto.UserRegisterRequest;
import com.chou.springbootecommerceweb.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
