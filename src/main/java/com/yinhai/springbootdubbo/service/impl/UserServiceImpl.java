package com.yinhai.springbootdubbo.service.impl;

import com.yinhai.springbootdubbo.domain.User;
import com.yinhai.springbootdubbo.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        user.setId("001");
        user.setName("Tzr");
        user.setSex("男");
        System.out.println(user.toString());
        return user;
    }
}
