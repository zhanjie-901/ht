package com.ht.bean;

public class AduitType {
    /**
    * 主键，标识列，自动生成
    */
    private Integer aduittypeid;

    /**
    * 1:教研部，2：学工科，3：教师考评，4：班主任考评，5：招生就业，6.后勤，7：成人教育
    */
    private String aduittypename;

    /**
    * 关联部门表
    */
    private Integer depid;

    public Integer getAduittypeid() {
        return aduittypeid;
    }

    public void setAduittypeid(Integer aduittypeid) {
        this.aduittypeid = aduittypeid;
    }

    public String getAduittypename() {
        return aduittypename;
    }

    public void setAduittypename(String aduittypename) {
        this.aduittypename = aduittypename;
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
        sb.append(", aduittypeid=").append(aduittypeid);
        sb.append(", aduittypename=").append(aduittypename);
        sb.append(", depid=").append(depid);
        sb.append("]");
        return sb.toString();
    }
}