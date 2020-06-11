package com.ht.dao;

import com.ht.bean.StudentFloor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface StudentFloorMapper {
    int deleteByPrimaryKey(Integer floorid);

    int insert(StudentFloor record);

    int insertSelective(StudentFloor record);

    StudentFloor selectByPrimaryKey(Integer floorid);

    List<StudentFloor> selAll();

    int updateByPrimaryKeySelective(StudentFloor record);

    int updateByPrimaryKey(StudentFloor record);
}