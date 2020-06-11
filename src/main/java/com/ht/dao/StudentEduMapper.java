package com.ht.dao;

import com.ht.bean.StudentEdu;

public interface StudentEduMapper {
    int deleteByPrimaryKey(Integer eduid);

    int insert(StudentEdu record);

    int insertSelective(StudentEdu record);

    StudentEdu selectByPrimaryKey(Integer eduid);

    int updateByPrimaryKeySelective(StudentEdu record);

    int updateByPrimaryKey(StudentEdu record);
}