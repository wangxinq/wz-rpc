package com.wangxq.zz.provider;

import com.wangxq.zz.common.model.User;
import com.wangxq.zz.common.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("用户名："+user.getName());
        return user;
    }
}
