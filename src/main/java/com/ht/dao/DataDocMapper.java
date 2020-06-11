package com.ht.dao;

import com.ht.bean.DataDoc;


public interface DataDocMapper {
    int deleteByPrimaryKey(Integer docid);

    int insert(DataDoc record);

    int insertSelective(DataDoc record);

    DataDoc selectByPrimaryKey(Integer docid);

    int updateByPrimaryKeySelective(DataDoc record);

    int updateByPrimaryKey(DataDoc record);
}