package com.ht.bean;

public class AduitModel {
    /**
    * 主键，标识列，自动生成
    */
    private Integer aduitmodelid;

    /**
    * 考核内容
    */
    private String aduitname;

    /**
    * 考核分数
    */
    private Integer scores;

    /**
    * 关联部门表
    */
    private Integer depid;

    /**
    * 说明
    */
    private String remark;

    public Integer getAduitmodelid() {
        return aduitmodelid;
    }

    public void setAduitmodelid(Integer aduitmodelid) {
        this.aduitmodelid = aduitmodelid;
    }

    public String getAduitname() {
        return aduitname;
    }

    public void setAduitname(String aduitname) {
        this.aduitname = aduitname;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
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
        sb.append(", aduitmodelid=").append(aduitmodelid);
        sb.append(", aduitname=").append(aduitname);
        sb.append(", scores=").append(scores);
        sb.append(", depid=").append(depid);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}