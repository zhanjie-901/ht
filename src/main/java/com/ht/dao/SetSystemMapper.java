package com.ht.dao;

import com.ht.bean.SetSystem;

public interface SetSystemMapper {
    int deleteByPrimaryKey(Integer setid);

    int insert(SetSystem record);

    int insertSelective(SetSystem record);

    SetSystem selectByPrimaryKey(Integer setid);

    int updateByPrimaryKeySelective(SetSystem record);

    int updateByPrimaryKey(SetSystem record);
}