package com.ht.bean;

import java.util.Date;

public class Education {
    /**
    * 主键，标识列，自动生成
    */
    private Integer collegeid;

    /**
    * 关联Emp表empid字段
    */
    private Integer empid;

    /**
    * 学校名称
    */
    private String collegename;

    /**
    * 学历
    */
    private String degree;

    /**
    * 入校时间
    */
    private Date startdate;

    /**
    * 毕业时间
    */
    private Date enddate;

    /**
    * 奖惩情况
    */
    private String remark;

    public Integer getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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
        sb.append(", collegeid=").append(collegeid);
        sb.append(", empid=").append(empid);
        sb.append(", collegename=").append(collegename);
        sb.append(", degree=").append(degree);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}