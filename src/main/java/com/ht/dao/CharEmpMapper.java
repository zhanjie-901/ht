package com.ht.dao;

import com.ht.bean.CharEmp;

public interface CharEmpMapper {
    int deleteByPrimaryKey(Integer charempid);

    int insert(CharEmp record);

    int insertSelective(CharEmp record);

    CharEmp selectByPrimaryKey(Integer charempid);

    int updateByPrimaryKeySelective(CharEmp record);

    int updateByPrimaryKey(CharEmp record);
}