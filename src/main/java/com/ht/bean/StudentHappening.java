package com.ht.bean;

public class StudentHappening {
    /**
    * 主键
    */
    private Integer happenid;

    /**
    * 学生表 外键
    */
    private Integer stuid;

    /**
    * 情况记录
    */
    private String happening;

    /**
    * 记录时间
    */
    private String optime;

    /**
    * 记录人 session获取id
    */
    private Integer empid;

    public Integer getHappenid() {
        return happenid;
    }

    public void setHappenid(Integer happenid) {
        this.happenid = happenid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getHappening() {
        return happening;
    }

    public void setHappening(String happening) {
        this.happening = happening;
    }

    public String getOptime() {
        return optime;
    }

    public void setOptime(String optime) {
        this.optime = optime;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", happenid=").append(happenid);
        sb.append(", stuid=").append(stuid);
        sb.append(", happening=").append(happening);
        sb.append(", optime=").append(optime);
        sb.append(", empid=").append(empid);
        sb.append("]");
        return sb.toString();
    }
}