package com.ht.dao;

import com.ht.bean.SystemLog;

public interface SystemLogMapper {
    int deleteByPrimaryKey(Integer logid);

    int insert(SystemLog record);

    int insertSelective(SystemLog record);

    SystemLog selectByPrimaryKey(Integer logid);

    int updateByPrimaryKeySelective(SystemLog record);

    int updateByPrimaryKey(SystemLog record);
}