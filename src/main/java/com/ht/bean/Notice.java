package com.ht.bean;

import java.util.Date;

public class Notice {
    /**
    * 主键，标识列，自动生成
    */
    private Integer noticeid;

    /**
    * 标题
    */
    private String title;

    /**
    * 通知内容
    */
    private String content;

    /**
    * 类型;1:所有人，2员工
    */
    private Integer noticetype;

    /**
    * 发布人
    */
    private String empid;

    /**
    * 发布时间
    */
    private Date noticetime;

    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getNoticetype() {
        return noticetype;
    }

    public void setNoticetype(Integer noticetype) {
        this.noticetype = noticetype;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public Date getNoticetime() {
        return noticetime;
    }

    public void setNoticetime(Date noticetime) {
        this.noticetime = noticetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noticeid=").append(noticeid);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", noticetype=").append(noticetype);
        sb.append(", empid=").append(empid);
        sb.append(", noticetime=").append(noticetime);
        sb.append("]");
        return sb.toString();
    }
}