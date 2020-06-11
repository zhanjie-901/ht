package com.ht.dao;

import com.ht.bean.StudentFamily;

public interface StudentFamilyMapper {
    int deleteByPrimaryKey(Integer familyid);

    int insert(StudentFamily record);

    int insertSelective(StudentFamily record);

    StudentFamily selectByPrimaryKey(Integer familyid);

    int updateByPrimaryKeySelective(StudentFamily record);

    int updateByPrimaryKey(StudentFamily record);
}