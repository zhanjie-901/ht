package com.ht.dao;

import com.ht.bean.StudentFall;

public interface StudentFallMapper {
    int deleteByPrimaryKey(Integer fallid);

    int insert(StudentFall record);

    int insertSelective(StudentFall record);

    StudentFall selectByPrimaryKey(Integer fallid);

    int updateByPrimaryKeySelective(StudentFall record);

    int updateByPrimaryKey(StudentFall record);
}