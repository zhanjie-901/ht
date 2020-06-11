package com.ht.bean;

import java.util.Date;

public class Weekmanagement {
    /**
    * 主键，标识列，自动生成
    */
    private Integer worklogid;

    /**
    * 关联Emp表empid字段
    */
    private String empid;

    /**
    * 填写日期
    */
    private Date workday;

    /**
    * 本周情况描述
    */
    private String weekcur;

    /**
    * 问题学生情况反馈
    */
    private String studentquestion;

    /**
    * 意见建议
    */
    private String idea;

    /**
    * 下周工作计划
    */
    private String weeknext;

    public Integer getWorklogid() {
        return worklogid;
    }

    public void setWorklogid(Integer worklogid) {
        this.worklogid = worklogid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public Date getWorkday() {
        return workday;
    }

    public void setWorkday(Date workday) {
        this.workday = workday;
    }

    public String getWeekcur() {
        return weekcur;
    }

    public void setWeekcur(String weekcur) {
        this.weekcur = weekcur;
    }

    public String getStudentquestion() {
        return studentquestion;
    }

    public void setStudentquestion(String studentquestion) {
        this.studentquestion = studentquestion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String getWeeknext() {
        return weeknext;
    }

    public void setWeeknext(String weeknext) {
        this.weeknext = weeknext;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", worklogid=").append(worklogid);
        sb.append(", empid=").append(empid);
        sb.append(", workday=").append(workday);
        sb.append(", weekcur=").append(weekcur);
        sb.append(", studentquestion=").append(studentquestion);
        sb.append(", idea=").append(idea);
        sb.append(", weeknext=").append(weeknext);
        sb.append("]");
        return sb.toString();
    }
}