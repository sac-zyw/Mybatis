package com.sac.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ShiAC
 * @date 2020/3/24
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            String resource = "SqlMapConfig.xml";
            InputStream stream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 从sqlSessionFactory中获取sqlSession对象
     * sqlSession包含了执行sql的所有方法
     *
     * @return
     */
    public static SqlSession getSqlSession() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
