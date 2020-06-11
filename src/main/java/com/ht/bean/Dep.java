package com.ht.bean;

public class Dep {
    /**
    * 主键，标识列，自动生成
    */
    private Integer depid;

    /**
    * 部门名称
    */
    private String depname;

    /**
    * 父部门名称
    */
    private Integer parentid;

    /**
    * 部门负责人
    */
    private String chairman;

    /**
    * 备注
    */
    private String remark;

    /**
    * 是否为人事部
    */
    private Integer personnel;

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getChairman() {
        return chairman;
    }

    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Integer personnel) {
        this.personnel = personnel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", depid=").append(depid);
        sb.append(", depname=").append(depname);
        sb.append(", parentid=").append(parentid);
        sb.append(", chairman=").append(chairman);
        sb.append(", remark=").append(remark);
        sb.append(", personnel=").append(personnel);
        sb.append("]");
        return sb.toString();
    }
}