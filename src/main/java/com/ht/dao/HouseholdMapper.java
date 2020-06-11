package com.ht.dao;

import com.ht.bean.Household;

public interface HouseholdMapper {
    int deleteByPrimaryKey(Integer cityid);

    int insert(Household record);

    int insertSelective(Household record);

    Household selectByPrimaryKey(Integer cityid);

    int updateByPrimaryKeySelective(Household record);

    int updateByPrimaryKey(Household record);
}