package com.ht.dao;

import com.ht.bean.CourseType;

public interface CourseTypeMapper {
    int deleteByPrimaryKey(Integer coursetypeid);

    int insert(CourseType record);

    int insertSelective(CourseType record);

    CourseType selectByPrimaryKey(Integer coursetypeid);

    int updateByPrimaryKeySelective(CourseType record);

    int updateByPrimaryKey(CourseType record);
}