package com.ht.dao;

import com.ht.bean.WeekArrange;

public interface WeekArrangeMapper {
    int deleteByPrimaryKey(Integer weekarrangeid);

    int insert(WeekArrange record);

    int insertSelective(WeekArrange record);

    WeekArrange selectByPrimaryKey(Integer weekarrangeid);

    int updateByPrimaryKeySelective(WeekArrange record);

    int updateByPrimaryKey(WeekArrange record);
}