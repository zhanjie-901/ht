package com.ht.dao;

import com.ht.bean.HolidayStudent;

public interface HolidayStudentMapper {
    int deleteByPrimaryKey(Integer holidayid);

    int insert(HolidayStudent record);

    int insertSelective(HolidayStudent record);

    HolidayStudent selectByPrimaryKey(Integer holidayid);

    int updateByPrimaryKeySelective(HolidayStudent record);

    int updateByPrimaryKey(HolidayStudent record);
}