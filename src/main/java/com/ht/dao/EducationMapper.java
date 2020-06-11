package com.ht.dao;

import com.ht.bean.Education;

public interface EducationMapper {
    int deleteByPrimaryKey(Integer collegeid);

    int insert(Education record);

    int insertSelective(Education record);

    Education selectByPrimaryKey(Integer collegeid);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}