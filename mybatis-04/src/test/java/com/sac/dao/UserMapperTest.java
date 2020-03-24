package com.sac.dao;

import com.sac.pojo.User;
import com.sac.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author ShiAC
 * @date 2020/3/24
 */
public class UserMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(5);
        //mapper.updateUser(new User(5,"tow","265200000"));
        //mapper.addUser(new User(12,"狂神的儿子","52615165"));
        /*
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        */
        sqlSession.close();
    }
}
