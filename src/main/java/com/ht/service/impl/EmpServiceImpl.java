package com.ht.service.impl;

import com.ht.bean.Emp;
import com.ht.dao.EmpDao;
import com.ht.service.IEmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService {
    @Resource
    private EmpDao empDao;

    @Override
    public int insert(Emp emp) {
        return empDao.insert(emp);
    }

    @Override
    public List<Emp> selAll() {
        return empDao.selList();
    }

    @Override
    public int del(int empid) {
        String s = String.valueOf(empid);
        return empDao.deleteByPrimaryKey(s);
    }

    @Override
    public Emp selById(int empid) {
        String s = String.valueOf(empid);
        return empDao.selectByPrimaryKey(s);
    }

    @Override
    public int upd(Emp emp) {
        return empDao.updateByPrimaryKey(emp);
    }


}
