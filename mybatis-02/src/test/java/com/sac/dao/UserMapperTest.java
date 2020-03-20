package com.sac.dao;

import com.sac.pojo.User;
import com.sac.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ShiAC
 * @date 2020/3/19
 */
public class UserMapperTest {
    @Test
    public void t1() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getUserList();
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
