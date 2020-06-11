package com.ht.bean;

public class Major {
    /**
    * 主键，标识列，自动生成
    */
    private Integer majorid;

    /**
    * 专业名称
    */
    private String majorname;

    /**
    * 系id
    */
    private Integer deptid;

    /**
    * 说明：（专业表）
    */
    private String remark;

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
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
        sb.append(", majorid=").append(majorid);
        sb.append(", majorname=").append(majorname);
        sb.append(", deptid=").append(deptid);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}