package com.ht.dao;

import com.ht.bean.ChatRecord;

public interface ChatRecordMapper {
    int deleteByPrimaryKey(Integer chatid);

    int insert(ChatRecord record);

    int insertSelective(ChatRecord record);

    ChatRecord selectByPrimaryKey(Integer chatid);

    int updateByPrimaryKeySelective(ChatRecord record);

    int updateByPrimaryKey(ChatRecord record);
}