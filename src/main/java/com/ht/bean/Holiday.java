package com.ht.bean;

public class Holiday {
    /**
    * 主键，标识列，自动生成
    */
    private Integer holidayid;

    /**
    * 关联Emp主键(请假人)
    */
    private Integer empid;

    /**
    * 假期天数
    */
    private String holidayday;

    /**
    * 开始时间
    */
    private String starttime;

    /**
    * 结束时间
    */
    private String endtime;

    /**
    * 标题
    */
    private String title;

    /**
    * 状态 1:审批中 2：已完成 3：不批准
    */
    private Integer status;

    /**
    * 内容
    */
    private String remark;

    public Integer getHolidayid() {
        return holidayid;
    }

    public void setHolidayid(Integer holidayid) {
        this.holidayid = holidayid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getHolidayday() {
        return holidayday;
    }

    public void setHolidayday(String holidayday) {
        this.holidayday = holidayday;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        sb.append(", holidayid=").append(holidayid);
        sb.append(", empid=").append(empid);
        sb.append(", holidayday=").append(holidayday);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", title=").append(title);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}