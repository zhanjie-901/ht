package com.ht.dao;

import com.ht.bean.Characters;

public interface CharactersMapper {
    int deleteByPrimaryKey(Integer characterid);

    int insert(Characters record);

    int insertSelective(Characters record);

    Characters selectByPrimaryKey(Integer characterid);

    int updateByPrimaryKeySelective(Characters record);

    int updateByPrimaryKey(Characters record);
}