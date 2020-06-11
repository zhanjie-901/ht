package com.ht.dao;

import com.ht.bean.Emp;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EmpDao {
    int deleteByPrimaryKey(String empid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(String empid);

    Emp login(Emp emp);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}