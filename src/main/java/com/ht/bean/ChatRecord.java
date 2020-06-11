package com.ht.bean;

public class ChatRecord {
    /**
    * 谈心主键id
    */
    private Integer chatid;

    /**
    * 学生表外键
    */
    private Integer sayface;

    /**
    * 员工表外键
    */
    private Integer teacher;

    /**
    * 地址
    */
    private String addr;

    /**
    * 谈心内容
    */
    private String sayscon;

    /**
    * 时间
    */
    private String chatdate;

    public Integer getChatid() {
        return chatid;
    }

    public void setChatid(Integer chatid) {
        this.chatid = chatid;
    }

    public Integer getSayface() {
        return sayface;
    }

    public void setSayface(Integer sayface) {
        this.sayface = sayface;
    }

    public Integer getTeacher() {
        return teacher;
    }

    public void setTeacher(Integer teacher) {
        this.teacher = teacher;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSayscon() {
        return sayscon;
    }

    public void setSayscon(String sayscon) {
        this.sayscon = sayscon;
    }

    public String getChatdate() {
        return chatdate;
    }

    public void setChatdate(String chatdate) {
        this.chatdate = chatdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chatid=").append(chatid);
        sb.append(", sayface=").append(sayface);
        sb.append(", teacher=").append(teacher);
        sb.append(", addr=").append(addr);
        sb.append(", sayscon=").append(sayscon);
        sb.append(", chatdate=").append(chatdate);
        sb.append("]");
        return sb.toString();
    }
}