package com.ht.bean;

public class Trial {
    /**
    * 主键，标识列，自动生成
    */
    private Integer trialid;

    /**
    * 日期
    */
    private String date;

    /**
    * 时间(星期一 ~  星期日)
    */
    private String time;

    /**
    * 关联课程/章节id
    */
    private Integer courseid;

    /**
    * 授课类型（试讲/培训）
    */
    private Integer type;

    /**
    * 员工id 关联员工表（授课老师）
    */
    private Integer empid;

    /**
    * 备注（针对课程重要内容），（试讲与培训计划表）
    */
    private String remark;

    public Integer getTrialid() {
        return trialid;
    }

    public void setTrialid(Integer trialid) {
        this.trialid = trialid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
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
        sb.append(", trialid=").append(trialid);
        sb.append(", date=").append(date);
        sb.append(", time=").append(time);
        sb.append(", courseid=").append(courseid);
        sb.append(", type=").append(type);
        sb.append(", empid=").append(empid);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}