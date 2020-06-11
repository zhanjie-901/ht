package com.ht.dao;

import com.ht.bean.EmpAssessment;

public interface EmpAssessmentMapper {
    int deleteByPrimaryKey(Integer empassessid);

    int insert(EmpAssessment record);

    int insertSelective(EmpAssessment record);

    EmpAssessment selectByPrimaryKey(Integer empassessid);

    int updateByPrimaryKeySelective(EmpAssessment record);

    int updateByPrimaryKey(EmpAssessment record);
}