package com.ht.bean;

import java.util.Date;

public class Email {
    /**
    * 主键，标识列，自动生成
    */
    private Integer emailid;

    /**
    * 发布人
    */
    private String empid;

    /**
    * 接收人
    */
    private String receid;

    /**
    * 标题
    */
    private String topic;

    /**
    * 发布内容
    */
    private String content;

    /**
    * 发布时间
    */
    private Date sendtime;

    /**
    * 是否已读,1:已读,2:未读
    */
    private Integer isread;

    /**
    * 附件
    */
    private String image;

    private String oldfilename;

    public Integer getEmailid() {
        return emailid;
    }

    public void setEmailid(Integer emailid) {
        this.emailid = emailid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getReceid() {
        return receid;
    }

    public void setReceid(String receid) {
        this.receid = receid;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOldfilename() {
        return oldfilename;
    }

    public void setOldfilename(String oldfilename) {
        this.oldfilename = oldfilename;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", emailid=").append(emailid);
        sb.append(", empid=").append(empid);
        sb.append(", receid=").append(receid);
        sb.append(", topic=").append(topic);
        sb.append(", content=").append(content);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", isread=").append(isread);
        sb.append(", image=").append(image);
        sb.append(", oldfilename=").append(oldfilename);
        sb.append("]");
        return sb.toString();
    }
}