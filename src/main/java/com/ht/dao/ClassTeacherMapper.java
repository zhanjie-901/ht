package com.ht.dao;

import com.ht.bean.ClassTeacher;

public interface ClassTeacherMapper {
    int deleteByPrimaryKey(Integer classteacherid);

    int insert(ClassTeacher record);

    int insertSelective(ClassTeacher record);

    ClassTeacher selectByPrimaryKey(Integer classteacherid);

    int updateByPrimaryKeySelective(ClassTeacher record);

    int updateByPrimaryKey(ClassTeacher record);
}