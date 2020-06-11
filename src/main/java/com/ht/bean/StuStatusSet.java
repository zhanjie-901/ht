package com.ht.bean;

public class StuStatusSet {
    /**
    * 主键，标识列，自动生成
    */
    private Integer statusid;

    /**
    * 状态名称：意向学生、预定报名学生、试学学生、在读学生、已毕业学生
    */
    private String statusname;

    /**
    * 说明
    */
    private String remark;

    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
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
        sb.append(", statusid=").append(statusid);
        sb.append(", statusname=").append(statusname);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}