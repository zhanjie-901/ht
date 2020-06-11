package com.ht.service;

import com.ht.bean.Emp;

import java.util.List;

public interface IEmpService {
    int insert(Emp emp);
    List<Emp> selAll();
    int del(int empid);
    Emp selById(int empid);
    int upd(Emp emp);
}
