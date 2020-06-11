package com.ht.dao;

import com.ht.bean.AduitLog;


public interface AduitLogMapper {
    int deleteByPrimaryKey(Integer aduitlogid);

    int insert(AduitLog record);

    int insertSelective(AduitLog record);

    AduitLog selectByPrimaryKey(Integer aduitlogid);

    int updateByPrimaryKeySelective(AduitLog record);

    int updateByPrimaryKey(AduitLog record);
}