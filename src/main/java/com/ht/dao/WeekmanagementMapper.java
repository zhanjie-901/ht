package com.ht.dao;

import com.ht.bean.Weekmanagement;

public interface WeekmanagementMapper {
    int deleteByPrimaryKey(Integer worklogid);

    int insert(Weekmanagement record);

    int insertSelective(Weekmanagement record);

    Weekmanagement selectByPrimaryKey(Integer worklogid);

    int updateByPrimaryKeySelective(Weekmanagement record);

    int updateByPrimaryKey(Weekmanagement record);
}