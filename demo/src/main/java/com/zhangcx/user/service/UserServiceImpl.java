package com.zhangcx.user.service;

import com.zhangcx.user.mapper.UserMapper;
import com.zhangcx.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryByUuid(String uuid) {
        User user = userMapper.selectByPrimaryKey(uuid);
        return user;
    }
}
