package com.ht.dao;

import com.ht.bean.CharModule;

public interface CharModuleMapper {
    int deleteByPrimaryKey(Integer charmoduleid);

    int insert(CharModule record);

    int insertSelective(CharModule record);

    CharModule selectByPrimaryKey(Integer charmoduleid);

    int updateByPrimaryKeySelective(CharModule record);

    int updateByPrimaryKey(CharModule record);
}