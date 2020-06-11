package com.ht.dao;

import com.ht.bean.Feedback;

public interface FeedbackMapper {
    int deleteByPrimaryKey(Integer feedbackid);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectByPrimaryKey(Integer feedbackid);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);
}