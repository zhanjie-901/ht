package com.ht.bean;

public class StudentFall {
    /**
    * 主键
    */
    private Integer fallid;

    /**
    * 届别名称
    */
    private String level;

    /**
    * 说明：（界别表，如19春）
    */
    private String remark;

    public Integer getFallid() {
        return fallid;
    }

    public void setFallid(Integer fallid) {
        this.fallid = fallid;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
        sb.append(", fallid=").append(fallid);
        sb.append(", level=").append(level);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}