package com.ht.bean;

public class EmpAssessmentTotal {
    /**
    * 主键，标识列，自动生成
    */
    private Integer empasstotalid;

    /**
    * 关联员工表
    */
    private Integer empid;

    /**
    * 总得分
    */
    private Integer totalscores;

    /**
    * 备注
    */
    private String remark;

    public Integer getEmpasstotalid() {
        return empasstotalid;
    }

    public void setEmpasstotalid(Integer empasstotalid) {
        this.empasstotalid = empasstotalid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getTotalscores() {
        return totalscores;
    }

    public void setTotalscores(Integer totalscores) {
        this.totalscores = totalscores;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empasstotalid=").append(empasstotalid);
        sb.append(", empid=").append(empid);
        sb.append(", totalscores=").append(totalscores);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}