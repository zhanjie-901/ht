package com.ht.service;

import com.ht.bean.Emp;

public interface LoginEmpService {
    Emp login(Emp emp);
    int register(Emp emp);
}
