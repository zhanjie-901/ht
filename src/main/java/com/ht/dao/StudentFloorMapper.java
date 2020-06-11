package com.ht.dao;

import com.ht.bean.StudentFloor;

public interface StudentFloorMapper {
    int deleteByPrimaryKey(Integer floorid);

    int insert(StudentFloor record);

    int insertSelective(StudentFloor record);

    StudentFloor selectByPrimaryKey(Integer floorid);

    int updateByPrimaryKeySelective(StudentFloor record);

    int updateByPrimaryKey(StudentFloor record);
}