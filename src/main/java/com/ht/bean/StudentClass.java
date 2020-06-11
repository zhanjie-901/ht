package com.ht.bean;

public class StudentClass {
    /**
    * 主键
    */
    private Integer classid;

    /**
    * 班级编号
    */
    private String classno;

    /**
    * 班级名称
    */
    private String classname;

    /**
    * 班级人数
    */
    private Integer count;

    /**
    * 授课老师，员工外键
    */
    private String teacher;

    /**
    * 班主任，员工表外键
    */
    private String classteacher;

    /**
    * 班级类别，关联班级类别表
    */
    private Integer classtype;

    /**
    * 备注
    */
    private String remark;

    /**
    * 关联 班级类别
    */
    private Integer falled;

    /**
    * 关联 系
    */
    private Integer deptid;

    /**
    * 关联 专业表
    */
    private Integer majorid;

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassteacher() {
        return classteacher;
    }

    public void setClassteacher(String classteacher) {
        this.classteacher = classteacher;
    }

    public Integer getClasstype() {
        return classtype;
    }

    public void setClasstype(Integer classtype) {
        this.classtype = classtype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getFalled() {
        return falled;
    }

    public void setFalled(Integer falled) {
        this.falled = falled;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classid=").append(classid);
        sb.append(", classno=").append(classno);
        sb.append(", classname=").append(classname);
        sb.append(", count=").append(count);
        sb.append(", teacher=").append(teacher);
        sb.append(", classteacher=").append(classteacher);
        sb.append(", classtype=").append(classtype);
        sb.append(", remark=").append(remark);
        sb.append(", falled=").append(falled);
        sb.append(", deptid=").append(deptid);
        sb.append(", majorid=").append(majorid);
        sb.append("]");
        return sb.toString();
    }
}