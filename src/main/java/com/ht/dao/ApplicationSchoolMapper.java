package com.ht.dao;

import com.ht.bean.ApplicationSchool;

public interface ApplicationSchoolMapper {
    int deleteByPrimaryKey(Integer appid);

    int insert(ApplicationSchool record);

    int insertSelective(ApplicationSchool record);

    ApplicationSchool selectByPrimaryKey(Integer appid);

    int updateByPrimaryKeySelective(ApplicationSchool record);

    int updateByPrimaryKey(ApplicationSchool record);
}