package com.ht.dao;

import com.ht.bean.Email;

public interface EmailMapper {
    int deleteByPrimaryKey(Integer emailid);

    int insert(Email record);

    int insertSelective(Email record);

    Email selectByPrimaryKey(Integer emailid);

    int updateByPrimaryKeySelective(Email record);

    int updateByPrimaryKey(Email record);
}