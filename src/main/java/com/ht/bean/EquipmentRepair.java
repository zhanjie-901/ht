package com.ht.bean;

public class EquipmentRepair {
    /**
    * 主键，标识列，自动生成
    */
    private Integer equipmentid;

    /**
    * 维修设备名称
    */
    private String equipmenttype;

    /**
    * 维修状态 0未完成  1已完成
    */
    private Integer status;

    /**
    * 关联班级表主键
    */
    private Integer classes;

    /**
    * 关联学生表申请人
    */
    private Integer student;

    /**
    * 备注
    */
    private String remark;

    /**
    * 部门编号
    */
    private Integer depid;

    /**
    * 1学生  2员工
    */
    private Integer usertype;

    /**
    * 开始时间
    */
    private String starttime;

    /**
    * 结束时间
    */
    private String endtime;

    public Integer getEquipmentid() {
        return equipmentid;
    }

    public void setEquipmentid(Integer equipmentid) {
        this.equipmentid = equipmentid;
    }

    public String getEquipmenttype() {
        return equipmenttype;
    }

    public void setEquipmenttype(String equipmenttype) {
        this.equipmenttype = equipmenttype;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getClasses() {
        return classes;
    }

    public void setClasses(Integer classes) {
        this.classes = classes;
    }

    public Integer getStudent() {
        return student;
    }

    public void setStudent(Integer student) {
        this.student = student;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", equipmentid=").append(equipmentid);
        sb.append(", equipmenttype=").append(equipmenttype);
        sb.append(", status=").append(status);
        sb.append(", classes=").append(classes);
        sb.append(", student=").append(student);
        sb.append(", remark=").append(remark);
        sb.append(", depid=").append(depid);
        sb.append(", usertype=").append(usertype);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append("]");
        return sb.toString();
    }
}