package com.ht.dao;

import com.ht.bean.Print;

public interface PrintMapper {
    int deleteByPrimaryKey(Integer printid);

    int insert(Print record);

    int insertSelective(Print record);

    Print selectByPrimaryKey(Integer printid);

    int updateByPrimaryKeySelective(Print record);

    int updateByPrimaryKey(Print record);
}