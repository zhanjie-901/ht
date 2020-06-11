package com.ht.bean;

import java.util.Date;

public class Feedback {
    /**
    * 主键，标识列，自动生成
    */
    private Integer feedbackid;

    /**
    * 1：员工，2学生
    */
    private Integer feedbacktype;

    private String empid;

    /**
    * 获取session中学生班级及姓名或员工姓名
    */
    private String empname;

    /**
    * 反馈时间，获取系统时间
    */
    private Date feedbacktime;

    /**
    * 建议
    */
    private String remark;

    /**
    * 图片
    */
    private String image;

    /**
    * 1 未处理 2 已处理
    */
    private Integer status;

    /**
    * 部门
    */
    private Integer depid;

    /**
    * 审批意见
    */
    private String opinion;

    /**
    * 审批人
    */
    private Integer userid;

    public Integer getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(Integer feedbackid) {
        this.feedbackid = feedbackid;
    }

    public Integer getFeedbacktype() {
        return feedbacktype;
    }

    public void setFeedbacktype(Integer feedbacktype) {
        this.feedbacktype = feedbacktype;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Date getFeedbacktime() {
        return feedbacktime;
    }

    public void setFeedbacktime(Date feedbacktime) {
        this.feedbacktime = feedbacktime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", feedbackid=").append(feedbackid);
        sb.append(", feedbacktype=").append(feedbacktype);
        sb.append(", empid=").append(empid);
        sb.append(", empname=").append(empname);
        sb.append(", feedbacktime=").append(feedbacktime);
        sb.append(", remark=").append(remark);
        sb.append(", image=").append(image);
        sb.append(", status=").append(status);
        sb.append(", depid=").append(depid);
        sb.append(", opinion=").append(opinion);
        sb.append(", userid=").append(userid);
        sb.append("]");
        return sb.toString();
    }
}