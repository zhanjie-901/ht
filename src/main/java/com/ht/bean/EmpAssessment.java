package com.ht.bean;

public class EmpAssessment {
    /**
    * 主键，标识列，自动生成
    */
    private Integer empassessid;

    /**
    * 考核指标关联考核指标表
    */
    private Integer aduitmodelid;

    /**
    * 得分
    */
    private Double scores;

    /**
    * 关联考核总表
    */
    private Integer empasstotalid;

    public Integer getEmpassessid() {
        return empassessid;
    }

    public void setEmpassessid(Integer empassessid) {
        this.empassessid = empassessid;
    }

    public Integer getAduitmodelid() {
        return aduitmodelid;
    }

    public void setAduitmodelid(Integer aduitmodelid) {
        this.aduitmodelid = aduitmodelid;
    }

    public Double getScores() {
        return scores;
    }

    public void setScores(Double scores) {
        this.scores = scores;
    }

    public Integer getEmpasstotalid() {
        return empasstotalid;
    }

    public void setEmpasstotalid(Integer empasstotalid) {
        this.empasstotalid = empasstotalid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empassessid=").append(empassessid);
        sb.append(", aduitmodelid=").append(aduitmodelid);
        sb.append(", scores=").append(scores);
        sb.append(", empasstotalid=").append(empasstotalid);
        sb.append("]");
        return sb.toString();
    }
}