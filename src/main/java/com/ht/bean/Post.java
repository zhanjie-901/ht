package com.ht.bean;

public class Post {
    /**
    * 主键，标识列，自动生成
    */
    private Integer postid;

    /**
    * 岗位名称
    */
    private String postname;

    /**
    * 备注
    */
    private String remark;

    /**
    * 关联部门表主键
    */
    private Integer depid;

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postid=").append(postid);
        sb.append(", postname=").append(postname);
        sb.append(", remark=").append(remark);
        sb.append(", depid=").append(depid);
        sb.append("]");
        return sb.toString();
    }
}