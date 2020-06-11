package com.ht.service.impl;

import com.ht.bean.StudentClass;
import com.ht.dao.StudentClassMapper;
import com.ht.service.IStudentClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentClassServiceImpl implements IStudentClassService {
    @Resource
    private StudentClassMapper studentClassMapper;

    @Override
    public List<StudentClass> selAll() {
        return studentClassMapper.selAll();
    }
}
