package com.ht.bean;

public class Course {
    /**
    * 主键，标识列，自动生成
    */
    private Integer courseid;

    /**
    * 课程名称
    */
    private String coursename;

    /**
    * 是否必修
    */
    private String isobligatory;

    /**
    * 课程类别id外键
    */
    private Integer coursetypeid;

    /**
    * 说明：（课程表）
    */
    private String remark;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getIsobligatory() {
        return isobligatory;
    }

    public void setIsobligatory(String isobligatory) {
        this.isobligatory = isobligatory;
    }

    public Integer getCoursetypeid() {
        return coursetypeid;
    }

    public void setCoursetypeid(Integer coursetypeid) {
        this.coursetypeid = coursetypeid;
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
        sb.append(", courseid=").append(courseid);
        sb.append(", coursename=").append(coursename);
        sb.append(", isobligatory=").append(isobligatory);
        sb.append(", coursetypeid=").append(coursetypeid);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}