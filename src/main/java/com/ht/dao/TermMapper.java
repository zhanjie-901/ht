package com.ht.dao;

import com.ht.bean.Term;

public interface TermMapper {
    int deleteByPrimaryKey(Integer termid);

    int insert(Term record);

    int insertSelective(Term record);

    Term selectByPrimaryKey(Integer termid);

    int updateByPrimaryKeySelective(Term record);

    int updateByPrimaryKey(Term record);
}