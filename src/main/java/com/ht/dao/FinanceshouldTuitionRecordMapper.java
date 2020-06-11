package com.ht.dao;

import com.ht.bean.FinanceshouldTuitionRecord;

public interface FinanceshouldTuitionRecordMapper {
    int deleteByPrimaryKey(Integer financeid);

    int insert(FinanceshouldTuitionRecord record);

    int insertSelective(FinanceshouldTuitionRecord record);

    FinanceshouldTuitionRecord selectByPrimaryKey(Integer financeid);

    int updateByPrimaryKeySelective(FinanceshouldTuitionRecord record);

    int updateByPrimaryKey(FinanceshouldTuitionRecord record);
}