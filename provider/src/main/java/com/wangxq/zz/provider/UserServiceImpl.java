package com.wangxq.zz;

import com.wangxq.zz.model.User;
import com.wangxq.zz.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("用户名："+user.getName());
        return user;
    }
}
