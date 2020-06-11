package com.ht.dao;

import com.ht.bean.ClassType;

public interface ClassTypeMapper {
    int deleteByPrimaryKey(Integer calsstypeid);

    int insert(ClassType record);

    int insertSelective(ClassType record);

    ClassType selectByPrimaryKey(Integer calsstypeid);

    int updateByPrimaryKeySelective(ClassType record);

    int updateByPrimaryKey(ClassType record);
}