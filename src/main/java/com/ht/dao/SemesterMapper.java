package com.ht.dao;

import com.ht.bean.Semester;

public interface SemesterMapper {
    int deleteByPrimaryKey(Integer semeid);

    int insert(Semester record);

    int insertSelective(Semester record);

    Semester selectByPrimaryKey(Integer semeid);

    int updateByPrimaryKeySelective(Semester record);

    int updateByPrimaryKey(Semester record);
}