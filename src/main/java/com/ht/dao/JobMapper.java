package com.ht.dao;

import com.ht.bean.Job;

public interface JobMapper {
    int deleteByPrimaryKey(Integer jobid);

    int insert(Job record);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer jobid);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}