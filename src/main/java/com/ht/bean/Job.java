package com.ht.bean;

import java.util.Date;

public class Job {
    /**
    * 主键，标识列，自动生成
    */
    private Integer jobid;

    /**
    * 关联Emp表empid字段
    */
    private String empid;

    /**
    * 公司名称
    */
    private String companyname;

    /**
    * 岗位
    */
    private String degree;

    /**
    * 入职时间
    */
    private Date startdate;

    /**
    * 离职时间
    */
    private Date enddate;

    /**
    * 离职原因
    */
    private String reason;

    /**
    * 说明
    */
    private String remark;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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
        sb.append(", jobid=").append(jobid);
        sb.append(", empid=").append(empid);
        sb.append(", companyname=").append(companyname);
        sb.append(", degree=").append(degree);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", reason=").append(reason);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}