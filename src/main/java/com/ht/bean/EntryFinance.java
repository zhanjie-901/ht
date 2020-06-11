package com.ht.bean;

import java.util.Date;

public class EntryFinance {
    /**
    * 主键，标识列，自动生成
    */
    private Integer entryid;

    /**
    * 缴费审核通过时间
    */
    private Date entrytime;

    /**
    * 招生信息Id
    */
    private Integer enrollmentid;

    /**
    * 审核人
    */
    private String reviewer;

    public Integer getEntryid() {
        return entryid;
    }

    public void setEntryid(Integer entryid) {
        this.entryid = entryid;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public Integer getEnrollmentid() {
        return enrollmentid;
    }

    public void setEnrollmentid(Integer enrollmentid) {
        this.enrollmentid = enrollmentid;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", entryid=").append(entryid);
        sb.append(", entrytime=").append(entrytime);
        sb.append(", enrollmentid=").append(enrollmentid);
        sb.append(", reviewer=").append(reviewer);
        sb.append("]");
        return sb.toString();
    }
}