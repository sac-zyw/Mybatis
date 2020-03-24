package com.sac.dao;

import com.sac.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author ShiAC
 * @date 2020/3/24
 */
public interface UserMapper {
    List<User> getUserList();

    //分页1查询 ---->limit
    List<User> getUserByLimit(Map<String,Integer> map);

    //分页2查询 ---->RowBounds
    List<User> getUserByRowBounds();
}
