package com.sac.dao;

import com.sac.pojo.User;

import java.util.List;

/**
 * @author ShiAC
 * @date 2020/3/24
 */
public interface UserMapper {
    List<User> getUserList();
}
