package com.zcw.service;

import com.zcw.pojo.Users;
import com.zcw.pojo.bo.UserBO;

public interface UserService {
    /**
     * 判断用户名是否存在
     */
    boolean queryUsernameIsExist(String username);

    /**
     * 创建用户
     */
    Users createUser(UserBO userBO);
}
