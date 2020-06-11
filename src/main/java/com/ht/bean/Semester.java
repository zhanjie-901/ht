package com.ht.bean;

public class Semester {
    /**
    * 主键，标识列，自动生成
    */
    private Integer semeid;

    /**
    * 学期名称
    */
    private String semestername;

    /**
    * 备注
    */
    private String remark;

    public Integer getSemeid() {
        return semeid;
    }

    public void setSemeid(Integer semeid) {
        this.semeid = semeid;
    }

    public String getSemestername() {
        return semestername;
    }

    public void setSemestername(String semestername) {
        this.semestername = semestername;
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
        sb.append(", semeid=").append(semeid);
        sb.append(", semestername=").append(semestername);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}