package com.ht.dao;

import com.ht.bean.AduitModel;

public interface AduitModelMapper {
    int deleteByPrimaryKey(Integer aduitmodelid);

    int insert(AduitModel record);

    int insertSelective(AduitModel record);

    AduitModel selectByPrimaryKey(Integer aduitmodelid);

    int updateByPrimaryKeySelective(AduitModel record);

    int updateByPrimaryKey(AduitModel record);
}