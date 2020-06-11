package com.ht.dao;

import com.ht.bean.FeedbackMsg;

public interface FeedbackMsgMapper {
    int deleteByPrimaryKey(Integer feedbackmsgid);

    int insert(FeedbackMsg record);

    int insertSelective(FeedbackMsg record);

    FeedbackMsg selectByPrimaryKey(Integer feedbackmsgid);

    int updateByPrimaryKeySelective(FeedbackMsg record);

    int updateByPrimaryKey(FeedbackMsg record);
}