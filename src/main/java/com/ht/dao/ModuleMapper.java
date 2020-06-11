package com.ht.dao;

import com.ht.bean.Module;

public interface ModuleMapper {
    int deleteByPrimaryKey(Integer moduleid);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(Integer moduleid);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}