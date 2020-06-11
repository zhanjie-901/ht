package com.ht.dao;

import com.ht.bean.EmpAssessmentTotal;

public interface EmpAssessmentTotalMapper {
    int deleteByPrimaryKey(Integer empasstotalid);

    int insert(EmpAssessmentTotal record);

    int insertSelective(EmpAssessmentTotal record);

    EmpAssessmentTotal selectByPrimaryKey(Integer empasstotalid);

    int updateByPrimaryKeySelective(EmpAssessmentTotal record);

    int updateByPrimaryKey(EmpAssessmentTotal record);
}