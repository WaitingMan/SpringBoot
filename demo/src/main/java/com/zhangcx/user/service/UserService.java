package com.zhangcx.user.service;

import com.zhangcx.user.pojo.User;

public interface UserService {

    public User queryByUuid(String uuid);
}
