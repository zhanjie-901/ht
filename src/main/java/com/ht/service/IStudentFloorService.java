package com.ht.service;

import com.ht.bean.StudentFloor;

import java.util.List;

public interface IStudentFloorService {
    List<StudentFloor> list();
    int delById(int id);
    int insert(StudentFloor studentFloor);
    int upd(StudentFloor studentFloor);
}
