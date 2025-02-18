package com.wangxq.zz.common.service;

import com.wangxq.zz.common.model.User;

/**
 * 用户服务
 */
public interface UserService {

    /**
     * 获取用户
     * @param user
     * @return
     */
    User getUser(User user);
    default short getNumber(){
        return 1;
    }
}