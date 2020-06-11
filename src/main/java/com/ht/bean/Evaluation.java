package com.ht.bean;

public class Evaluation {
    private Integer evaluationid;

    private Integer evaluationname;

    private Integer score;

    private Integer evaluationtype;

    private String remark;

    public Integer getEvaluationid() {
        return evaluationid;
    }

    public void setEvaluationid(Integer evaluationid) {
        this.evaluationid = evaluationid;
    }

    public Integer getEvaluationname() {
        return evaluationname;
    }

    public void setEvaluationname(Integer evaluationname) {
        this.evaluationname = evaluationname;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getEvaluationtype() {
        return evaluationtype;
    }

    public void setEvaluationtype(Integer evaluationtype) {
        this.evaluationtype = evaluationtype;
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
        sb.append(", evaluationid=").append(evaluationid);
        sb.append(", evaluationname=").append(evaluationname);
        sb.append(", score=").append(score);
        sb.append(", evaluationtype=").append(evaluationtype);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}