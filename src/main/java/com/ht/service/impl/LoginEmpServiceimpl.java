package com.ht.service.impl;

import com.ht.bean.Emp;
import com.ht.dao.EmpDao;
import com.ht.service.LoginEmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginEmpServiceimpl implements LoginEmpService {

    @Resource
    EmpDao dao;

    @Override
    public Emp login(Emp emp) {
        return dao.login(emp);
    }

    @Override
    public int register(Emp emp) {
        return dao.insert(emp);
    }

}
