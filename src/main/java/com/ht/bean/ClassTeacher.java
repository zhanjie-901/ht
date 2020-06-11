package com.ht.bean;

public class ClassTeacher {
    /**
    * 主键，标识列，自动生成
    */
    private Integer classteacherid;

    /**
    * 员工id
    */
    private String empid;

    /**
    * 班级id
    */
    private Integer classid;

    private Integer teachertype;

    private Integer courseid;

    private Integer status;

    public Integer getClassteacherid() {
        return classteacherid;
    }

    public void setClassteacherid(Integer classteacherid) {
        this.classteacherid = classteacherid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getTeachertype() {
        return teachertype;
    }

    public void setTeachertype(Integer teachertype) {
        this.teachertype = teachertype;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classteacherid=").append(classteacherid);
        sb.append(", empid=").append(empid);
        sb.append(", classid=").append(classid);
        sb.append(", teachertype=").append(teachertype);
        sb.append(", courseid=").append(courseid);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}