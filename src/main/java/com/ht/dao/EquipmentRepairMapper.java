package com.ht.dao;

import com.ht.bean.EquipmentRepair;

public interface EquipmentRepairMapper {
    int deleteByPrimaryKey(Integer equipmentid);

    int insert(EquipmentRepair record);

    int insertSelective(EquipmentRepair record);

    EquipmentRepair selectByPrimaryKey(Integer equipmentid);

    int updateByPrimaryKeySelective(EquipmentRepair record);

    int updateByPrimaryKey(EquipmentRepair record);
}