package com.sac.dao;

import com.sac.pojo.Student;

import java.util.List;

/**
 * @author ShiAC
 * @date 2020/3/24
 */
public interface StudentMapper {
    //查询所有的学生信息，以及对应的老师信息
    public List<Student> getStudent();

    public List<Student> getStudent2();
}
