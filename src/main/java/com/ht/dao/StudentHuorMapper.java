package com.ht.dao;

import com.ht.bean.StudentHuor;

public interface StudentHuorMapper {
    int deleteByPrimaryKey(Integer hourid);

    int insert(StudentHuor record);

    int insertSelective(StudentHuor record);

    StudentHuor selectByPrimaryKey(Integer hourid);

    int updateByPrimaryKeySelective(StudentHuor record);

    int updateByPrimaryKey(StudentHuor record);
}