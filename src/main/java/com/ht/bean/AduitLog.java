package com.ht.bean;

import java.util.Date;

public class AduitLog {
    /**
    * 主键，标识列，自动生成
    */
    private Integer aduitlogid;

    /**
    * 外键，考核指标id
    */
    private Integer aduitmodelid;

    /**
    * 员工id
    */
    private Integer empid;

    /**
    * 考核分数,根据考核指标规定的分数进行扣分负数或者加分为正数
    */
    private Integer scores;

    /**
    * 考核时间
    */
    private Date auditdate;

    /**
    * 说明
    */
    private String remark;

    /**
    * 录入人员，从session取值
    */
    private String auditperson;

    /**
    * 图片
    */
    private String image;

    public Integer getAduitlogid() {
        return aduitlogid;
    }

    public void setAduitlogid(Integer aduitlogid) {
        this.aduitlogid = aduitlogid;
    }

    public Integer getAduitmodelid() {
        return aduitmodelid;
    }

    public void setAduitmodelid(Integer aduitmodelid) {
        this.aduitmodelid = aduitmodelid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAuditperson() {
        return auditperson;
    }

    public void setAuditperson(String auditperson) {
        this.auditperson = auditperson;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aduitlogid=").append(aduitlogid);
        sb.append(", aduitmodelid=").append(aduitmodelid);
        sb.append(", empid=").append(empid);
        sb.append(", scores=").append(scores);
        sb.append(", auditdate=").append(auditdate);
        sb.append(", remark=").append(remark);
        sb.append(", auditperson=").append(auditperson);
        sb.append(", image=").append(image);
        sb.append("]");
        return sb.toString();
    }
}