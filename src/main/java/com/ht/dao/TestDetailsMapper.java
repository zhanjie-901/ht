package com.ht.dao;

import com.ht.bean.TestDetails;

public interface TestDetailsMapper {
    int deleteByPrimaryKey(Integer sdetailsid);

    int insert(TestDetails record);

    int insertSelective(TestDetails record);

    TestDetails selectByPrimaryKey(Integer sdetailsid);

    int updateByPrimaryKeySelective(TestDetails record);

    int updateByPrimaryKey(TestDetails record);
}