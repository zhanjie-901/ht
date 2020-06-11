package com.ht.dao;

import com.ht.bean.StudentReplyScore;

public interface StudentReplyScoreMapper {
    int deleteByPrimaryKey(Integer replyid);

    int insert(StudentReplyScore record);

    int insertSelective(StudentReplyScore record);

    StudentReplyScore selectByPrimaryKey(Integer replyid);

    int updateByPrimaryKeySelective(StudentReplyScore record);

    int updateByPrimaryKey(StudentReplyScore record);
}