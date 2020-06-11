package com.ht.bean;

import java.math.BigDecimal;
import java.util.Date;

public class HolidayStudent {
    /**
    * 主键，标识列，自动生成
    */
    private Integer holidayid;

    /**
    * 关联学生表主键(请假人)
    */
    private Integer studentld;

    /**
    * 假期天数
    */
    private BigDecimal holidayday;

    /**
    * 开始时间
    */
    private Date starttime;

    /**
    * 结束时间
    */
    private Date endtime;

    /**
    * 标题
    */
    private String title;

    /**
    * 内容
    */
    private String remark;

    /**
    * 审批中，审批通过，审批未通过
    */
    private String status;

    public Integer getHolidayid() {
        return holidayid;
    }

    public void setHolidayid(Integer holidayid) {
        this.holidayid = holidayid;
    }

    public Integer getStudentld() {
        return studentld;
    }

    public void setStudentld(Integer studentld) {
        this.studentld = studentld;
    }

    public BigDecimal getHolidayday() {
        return holidayday;
    }

    public void setHolidayday(BigDecimal holidayday) {
        this.holidayday = holidayday;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", holidayid=").append(holidayid);
        sb.append(", studentld=").append(studentld);
        sb.append(", holidayday=").append(holidayday);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", title=").append(title);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}