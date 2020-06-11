package com.ht.bean;

public class StudentEdu {
    /**
    * 经历主键id
    */
    private Integer eduid;

    /**
    * 学生表外键
    */
    private Integer stuid;

    /**
    * 就读学校
    */
    private String school;

    /**
    * 开始时间
    */
    private String begindate;

    /**
    * 结束时间
    */
    private String enddate;

    public Integer getEduid() {
        return eduid;
    }

    public void setEduid(Integer eduid) {
        this.eduid = eduid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eduid=").append(eduid);
        sb.append(", stuid=").append(stuid);
        sb.append(", school=").append(school);
        sb.append(", begindate=").append(begindate);
        sb.append(", enddate=").append(enddate);
        sb.append("]");
        return sb.toString();
    }
}