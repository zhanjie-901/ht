package com.ht.bean;

public class Dept {
    /**
    * 主键
    */
    private Integer deptid;

    /**
    * 系名称
    */
    private String deptname;

    /**
    * 说明
    */
    private String remark;

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
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
        sb.append(", deptid=").append(deptid);
        sb.append(", deptname=").append(deptname);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}