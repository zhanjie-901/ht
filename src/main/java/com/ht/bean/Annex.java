package com.ht.bean;

import java.util.Date;

public class Annex {
    /**
    * 主键，标识列，自动生成
    */
    private Integer annexid;

    /**
    * 类型选择(1:员工,2:学生)
    */
    private String sename;

    /**
    * 关联员工或者学生ID
    */
    private String seid;

    /**
    * 附件名称
    */
    private String annexname;

    /**
    * 上传附件
    */
    private String annexnamee;

    /**
    * 上传时间
    */
    private Date annexdate;

    /**
    * 说明
    */
    private String remark;

    /**
    * 上传人
    */
    private String sessionname;

    public Integer getAnnexid() {
        return annexid;
    }

    public void setAnnexid(Integer annexid) {
        this.annexid = annexid;
    }

    public String getSename() {
        return sename;
    }

    public void setSename(String sename) {
        this.sename = sename;
    }

    public String getSeid() {
        return seid;
    }

    public void setSeid(String seid) {
        this.seid = seid;
    }

    public String getAnnexname() {
        return annexname;
    }

    public void setAnnexname(String annexname) {
        this.annexname = annexname;
    }

    public String getAnnexnamee() {
        return annexnamee;
    }

    public void setAnnexnamee(String annexnamee) {
        this.annexnamee = annexnamee;
    }

    public Date getAnnexdate() {
        return annexdate;
    }

    public void setAnnexdate(Date annexdate) {
        this.annexdate = annexdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSessionname() {
        return sessionname;
    }

    public void setSessionname(String sessionname) {
        this.sessionname = sessionname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", annexid=").append(annexid);
        sb.append(", sename=").append(sename);
        sb.append(", seid=").append(seid);
        sb.append(", annexname=").append(annexname);
        sb.append(", annexnamee=").append(annexnamee);
        sb.append(", annexdate=").append(annexdate);
        sb.append(", remark=").append(remark);
        sb.append(", sessionname=").append(sessionname);
        sb.append("]");
        return sb.toString();
    }
}