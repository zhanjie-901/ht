package com.ht.dao;

import com.ht.bean.StudentHappening;

public interface StudentHappeningMapper {
    int deleteByPrimaryKey(Integer happenid);

    int insert(StudentHappening record);

    int insertSelective(StudentHappening record);

    StudentHappening selectByPrimaryKey(Integer happenid);

    int updateByPrimaryKeySelective(StudentHappening record);

    int updateByPrimaryKey(StudentHappening record);
}