package com.ht.dao;

import com.ht.bean.EntryFinance;

public interface EntryFinanceMapper {
    int deleteByPrimaryKey(Integer entryid);

    int insert(EntryFinance record);

    int insertSelective(EntryFinance record);

    EntryFinance selectByPrimaryKey(Integer entryid);

    int updateByPrimaryKeySelective(EntryFinance record);

    int updateByPrimaryKey(EntryFinance record);
}