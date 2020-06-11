package com.ht.dao;

import com.ht.bean.Annex;

public interface AnnexMapper {
    int deleteByPrimaryKey(Integer annexid);

    int insert(Annex record);

    int insertSelective(Annex record);

    Annex selectByPrimaryKey(Integer annexid);

    int updateByPrimaryKeySelective(Annex record);

    int updateByPrimaryKey(Annex record);
}