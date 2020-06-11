package com.ht.bean;

public class Term {
    /**
    * 主键
    */
    private Integer termid;

    /**
    * 学期名称
    */
    private String termname;

    /**
    * 说明
    */
    private String remark;

    public Integer getTermid() {
        return termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    public String getTermname() {
        return termname;
    }

    public void setTermname(String termname) {
        this.termname = termname;
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
        sb.append(", termid=").append(termid);
        sb.append(", termname=").append(termname);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}