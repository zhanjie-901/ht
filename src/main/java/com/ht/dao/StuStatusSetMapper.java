package com.ht.dao;

import com.ht.bean.StuStatusSet;

public interface StuStatusSetMapper {
    int deleteByPrimaryKey(Integer statusid);

    int insert(StuStatusSet record);

    int insertSelective(StuStatusSet record);

    StuStatusSet selectByPrimaryKey(Integer statusid);

    int updateByPrimaryKeySelective(StuStatusSet record);

    int updateByPrimaryKey(StuStatusSet record);
}