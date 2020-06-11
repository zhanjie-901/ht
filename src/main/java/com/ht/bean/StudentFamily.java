package com.ht.bean;

public class StudentFamily {
    /**
    * 主键
    */
    private Integer familyid;

    /**
    * 学生表 外键
    */
    private Integer stuid;

    /**
    * 亲属姓名
    */
    private String familyname;

    /**
    * 与学生关系
    */
    private String relation;

    /**
    * 亲属电话
    */
    private String familyhone;

    public Integer getFamilyid() {
        return familyid;
    }

    public void setFamilyid(Integer familyid) {
        this.familyid = familyid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getFamilyhone() {
        return familyhone;
    }

    public void setFamilyhone(String familyhone) {
        this.familyhone = familyhone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", familyid=").append(familyid);
        sb.append(", stuid=").append(stuid);
        sb.append(", familyname=").append(familyname);
        sb.append(", relation=").append(relation);
        sb.append(", familyhone=").append(familyhone);
        sb.append("]");
        return sb.toString();
    }
}