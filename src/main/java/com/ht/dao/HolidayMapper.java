package com.ht.dao;

import com.ht.bean.Holiday;

public interface HolidayMapper {
    int deleteByPrimaryKey(Integer holidayid);

    int insert(Holiday record);

    int insertSelective(Holiday record);

    Holiday selectByPrimaryKey(Integer holidayid);

    int updateByPrimaryKeySelective(Holiday record);

    int updateByPrimaryKey(Holiday record);
}