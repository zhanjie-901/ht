package com.ht.bean;

public class CourseType {
    /**
    * 主键，标识列，自动生成
    */
    private Integer coursetypeid;

    /**
    * 类别名称(公共课，专业课)
    */
    private String coursetypename;

    /**
    * 说明：（课程类别表）
    */
    private String remark;

    public Integer getCoursetypeid() {
        return coursetypeid;
    }

    public void setCoursetypeid(Integer coursetypeid) {
        this.coursetypeid = coursetypeid;
    }

    public String getCoursetypename() {
        return coursetypename;
    }

    public void setCoursetypename(String coursetypename) {
        this.coursetypename = coursetypename;
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
        sb.append(", coursetypeid=").append(coursetypeid);
        sb.append(", coursetypename=").append(coursetypename);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}