package com.ht.bean;

public class WeekArrange {
    /**
    * 主键，标识列，自动生成
    */
    private Integer weekarrangeid;

    /**
    * 排班名称
    */
    private String weekarrangename;

    /**
    * 值班要求
    */
    private String ranges;

    /**
    * 一个星期中的那一天
    */
    private String week;

    /**
    * 关联Emp主键
    */
    private String empid;

    /**
    * 排序
    */
    private Integer orderid;

    /**
    * 总值班 1：是 2：否
    */
    private Integer duty;

    /**
    * 开始时间
    */
    private String starttime;

    /**
    * 结束时间
    */
    private String endtime;

    /**
    * 说明
    */
    private String remark;

    public Integer getWeekarrangeid() {
        return weekarrangeid;
    }

    public void setWeekarrangeid(Integer weekarrangeid) {
        this.weekarrangeid = weekarrangeid;
    }

    public String getWeekarrangename() {
        return weekarrangename;
    }

    public void setWeekarrangename(String weekarrangename) {
        this.weekarrangename = weekarrangename;
    }

    public String getRanges() {
        return ranges;
    }

    public void setRanges(String ranges) {
        this.ranges = ranges;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getDuty() {
        return duty;
    }

    public void setDuty(Integer duty) {
        this.duty = duty;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
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
        sb.append(", weekarrangeid=").append(weekarrangeid);
        sb.append(", weekarrangename=").append(weekarrangename);
        sb.append(", ranges=").append(ranges);
        sb.append(", week=").append(week);
        sb.append(", empid=").append(empid);
        sb.append(", orderid=").append(orderid);
        sb.append(", duty=").append(duty);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}