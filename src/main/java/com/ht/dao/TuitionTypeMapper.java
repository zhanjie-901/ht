package com.ht.dao;

import com.ht.bean.TuitionType;

public interface TuitionTypeMapper {
    int deleteByPrimaryKey(Integer tuitiontypeid);

    int insert(TuitionType record);

    int insertSelective(TuitionType record);

    TuitionType selectByPrimaryKey(Integer tuitiontypeid);

    int updateByPrimaryKeySelective(TuitionType record);

    int updateByPrimaryKey(TuitionType record);
}