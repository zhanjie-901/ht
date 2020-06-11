package com.ht.dao;

import com.ht.bean.AduitType;

public interface AduitTypeMapper {
    int deleteByPrimaryKey(Integer aduittypeid);

    int insert(AduitType record);

    int insertSelective(AduitType record);

    AduitType selectByPrimaryKey(Integer aduittypeid);

    int updateByPrimaryKeySelective(AduitType record);

    int updateByPrimaryKey(AduitType record);
}