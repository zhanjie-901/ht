package com.ht.bean;

public class ClassType {
    /**
    * 主键，标识列，自动生成
    */
    private Integer calsstypeid;

    /**
    * 1：高技，2：中技，3:3+2,4：成人教育
    */
    private String classtypename;

    public Integer getCalsstypeid() {
        return calsstypeid;
    }

    public void setCalsstypeid(Integer calsstypeid) {
        this.calsstypeid = calsstypeid;
    }

    public String getClasstypename() {
        return classtypename;
    }

    public void setClasstypename(String classtypename) {
        this.classtypename = classtypename;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", calsstypeid=").append(calsstypeid);
        sb.append(", classtypename=").append(classtypename);
        sb.append("]");
        return sb.toString();
    }
}