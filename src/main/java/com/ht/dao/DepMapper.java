package com.ht.dao;

import com.ht.bean.Dep;

public interface DepMapper {
    int deleteByPrimaryKey(Integer depid);

    int insert(Dep record);

    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Integer depid);

    int updateByPrimaryKeySelective(Dep record);

    int updateByPrimaryKey(Dep record);
}