package com.zhangcx.user.service;

import com.zhangcx.user.pojo.UserPO;

public interface UserService {

    /**
     * 通过主键id查询用户
     * @param uuid
     * @return
     */
    public UserPO selectUserByUuid(String uuid);
}
