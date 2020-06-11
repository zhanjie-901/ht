package com.ht.service.impl;

import com.ht.bean.StudentFloor;
import com.ht.dao.StudentFloorMapper;
import com.ht.service.IStudentFloorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentFloorServiceImpl implements IStudentFloorService {
    @Resource
    private StudentFloorMapper studentFloorMapper;
    @Override
    public List<StudentFloor> list() {
        return studentFloorMapper.selAll();
    }

    @Override
    public int delById(int id) {
        return studentFloorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StudentFloor studentFloor) {
        return studentFloorMapper.insert(studentFloor);
    }

    @Override
    public int upd(StudentFloor studentFloor) {
        return studentFloorMapper.updateByPrimaryKey(studentFloor);
    }
}
