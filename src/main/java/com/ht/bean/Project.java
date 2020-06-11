package com.ht.bean;

public class Project {
    /**
    * 主键，标识列，自动生成
    */
    private Integer projectid;

    /**
    * 项目名称
    */
    private String projectname;

    /**
    * 说明
    */
    private String remark;

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
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
        sb.append(", projectid=").append(projectid);
        sb.append(", projectname=").append(projectname);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}