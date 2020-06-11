package com.ht.bean;

public class StudentReplyScore {
    /**
    * 成绩主键
    */
    private Integer replyid;

    /**
    * 学生表 外键
    */
    private Integer studentid;

    /**
    * 关联答辩项目
    */
    private Integer projectid;

    /**
    * 打分老师管理员工表 外键
    */
    private Integer empid;

    /**
    * 功能完善 50
    */
    private Double score1;

    /**
    * 技术难度 10
    */
    private Double score2;

    /**
    * 界面完美 10
    */
    private Double score3;

    /**
    * 回答问题 10
    */
    private Double score4;

    /**
    * 演示方法 10
    */
    private Double score5;

    /**
    * 语言表达 10
    */
    private Double score6;

    /**
    * 总分 100
    */
    private Double score7;

    /**
    * 备注
    */
    private String remark;

    public Integer getReplyid() {
        return replyid;
    }

    public void setReplyid(Integer replyid) {
        this.replyid = replyid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Double getScore1() {
        return score1;
    }

    public void setScore1(Double score1) {
        this.score1 = score1;
    }

    public Double getScore2() {
        return score2;
    }

    public void setScore2(Double score2) {
        this.score2 = score2;
    }

    public Double getScore3() {
        return score3;
    }

    public void setScore3(Double score3) {
        this.score3 = score3;
    }

    public Double getScore4() {
        return score4;
    }

    public void setScore4(Double score4) {
        this.score4 = score4;
    }

    public Double getScore5() {
        return score5;
    }

    public void setScore5(Double score5) {
        this.score5 = score5;
    }

    public Double getScore6() {
        return score6;
    }

    public void setScore6(Double score6) {
        this.score6 = score6;
    }

    public Double getScore7() {
        return score7;
    }

    public void setScore7(Double score7) {
        this.score7 = score7;
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
        sb.append(", replyid=").append(replyid);
        sb.append(", studentid=").append(studentid);
        sb.append(", projectid=").append(projectid);
        sb.append(", empid=").append(empid);
        sb.append(", score1=").append(score1);
        sb.append(", score2=").append(score2);
        sb.append(", score3=").append(score3);
        sb.append(", score4=").append(score4);
        sb.append(", score5=").append(score5);
        sb.append(", score6=").append(score6);
        sb.append(", score7=").append(score7);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}