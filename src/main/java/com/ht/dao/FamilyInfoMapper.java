package com.ht.dao;

import com.ht.bean.FamilyInfo;

public interface FamilyInfoMapper {
    int deleteByPrimaryKey(Integer familyid);

    int insert(FamilyInfo record);

    int insertSelective(FamilyInfo record);

    FamilyInfo selectByPrimaryKey(Integer familyid);

    int updateByPrimaryKeySelective(FamilyInfo record);

    int updateByPrimaryKey(FamilyInfo record);
}