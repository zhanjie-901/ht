package com.ht.dao;

import com.ht.bean.Evaluation;

public interface EvaluationMapper {
    int insert(Evaluation record);

    int insertSelective(Evaluation record);
}