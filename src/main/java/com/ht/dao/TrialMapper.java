package com.ht.dao;

import com.ht.bean.Trial;

public interface TrialMapper {
    int deleteByPrimaryKey(Integer trialid);

    int insert(Trial record);

    int insertSelective(Trial record);

    Trial selectByPrimaryKey(Integer trialid);

    int updateByPrimaryKeySelective(Trial record);

    int updateByPrimaryKey(Trial record);
}