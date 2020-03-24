package com.sac.dao;

import com.sac.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ShiAC
 * @date 2020/3/24
 */
public interface TeacherMapper {
    //获取老四
    List<Teacher> getTeacher();
}
