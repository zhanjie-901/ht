package com.ht.dao;

import com.ht.bean.StudentScore;

public interface StudentScoreMapper {
    int deleteByPrimaryKey(Integer scoreid);

    int insert(StudentScore record);

    int insertSelective(StudentScore record);

    StudentScore selectByPrimaryKey(Integer scoreid);

    int updateByPrimaryKeySelective(StudentScore record);

    int updateByPrimaryKey(StudentScore record);
}