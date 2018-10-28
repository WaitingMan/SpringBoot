package com.zhangcx.user.service;

import com.zhangcx.user.mapper.UserMapper;
import com.zhangcx.user.pojo.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 通过主键id查询用户
     * @param uuid
     * @return
     */
    public UserPO selectUserByUuid(String uuid) {
        UserPO user = userMapper.selectByPrimaryKey(uuid);
        return user;
    }

}
