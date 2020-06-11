package com.ht.bean;

import java.util.Date;

public class FeedbackMsg {
    /**
    * 主键，标识列，自动生成
    */
    private Integer feedbackmsgid;

    private String feedbackmsgname;

    /**
    * 发送人id
    */
    private String userid;

    /**
    * 发送人名称
    */
    private String username;

    /**
    * 1 问题反馈人  2 回复人
    */
    private Integer msgtype;

    private Date singdate;

    /**
    * 问题反馈表id
    */
    private Integer feedbackid;

    public Integer getFeedbackmsgid() {
        return feedbackmsgid;
    }

    public void setFeedbackmsgid(Integer feedbackmsgid) {
        this.feedbackmsgid = feedbackmsgid;
    }

    public String getFeedbackmsgname() {
        return feedbackmsgname;
    }

    public void setFeedbackmsgname(String feedbackmsgname) {
        this.feedbackmsgname = feedbackmsgname;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(Integer msgtype) {
        this.msgtype = msgtype;
    }

    public Date getSingdate() {
        return singdate;
    }

    public void setSingdate(Date singdate) {
        this.singdate = singdate;
    }

    public Integer getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(Integer feedbackid) {
        this.feedbackid = feedbackid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", feedbackmsgid=").append(feedbackmsgid);
        sb.append(", feedbackmsgname=").append(feedbackmsgname);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", msgtype=").append(msgtype);
        sb.append(", singdate=").append(singdate);
        sb.append(", feedbackid=").append(feedbackid);
        sb.append("]");
        return sb.toString();
    }
}