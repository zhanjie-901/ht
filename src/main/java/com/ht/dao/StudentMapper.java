package com.ht.dao;

import com.ht.bean.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer studid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}