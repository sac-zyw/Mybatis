package com.sac.dao;

import com.sac.pojo.User;
import com.sac.utils.MybatisUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author ShiAC
 * @date 2020/3/19
 */
public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);

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

    @Test
    public void testLog4j() {
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }

    @Test
    public void testGetUserByLimit() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex", 2);
        map.put("pageSize", 5);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testGetUserByRowBounds(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //RowBounds实现
        RowBounds bounds = new RowBounds(1, 2);
        //通过java代码实现分页
        List<User> userList = sqlSession.selectList("com.sac.dao.UserMapper.getUserByRowBounds",null,bounds);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
