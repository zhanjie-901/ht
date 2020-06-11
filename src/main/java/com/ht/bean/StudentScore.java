package com.ht.bean;

public class StudentScore {
    /**
    * 成绩主键id
    */
    private Integer scoreid;

    /**
    * 学生表外键
    */
    private Integer stuid;

    /**
    * 学生成绩
    */
    private Integer score;

    /**
    * 补考成绩
    */
    private Integer rescore;

    /**
    * 关联课程id
    */
    private Integer courseid;

    /**
    * 1 笔试 2机试 3模拟面试
    */
    private Integer testtype;

    /**
    * 关联学期id
    */
    private Integer termid;

    /**
    * 考试时间
    */
    private String scoretime;

    /**
    * 录入员，获取session值
    */
    private Integer empid;

    /**
    * 备注
    */
    private String remark;

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getRescore() {
        return rescore;
    }

    public void setRescore(Integer rescore) {
        this.rescore = rescore;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getTesttype() {
        return testtype;
    }

    public void setTesttype(Integer testtype) {
        this.testtype = testtype;
    }

    public Integer getTermid() {
        return termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    public String getScoretime() {
        return scoretime;
    }

    public void setScoretime(String scoretime) {
        this.scoretime = scoretime;
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
        sb.append(", scoreid=").append(scoreid);
        sb.append(", stuid=").append(stuid);
        sb.append(", score=").append(score);
        sb.append(", rescore=").append(rescore);
        sb.append(", courseid=").append(courseid);
        sb.append(", testtype=").append(testtype);
        sb.append(", termid=").append(termid);
        sb.append(", scoretime=").append(scoretime);
        sb.append(", empid=").append(empid);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}