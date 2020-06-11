package com.ht.bean;

public class CharEmp {
    /**
    * 主键，标识列，自动生成
    */
    private Integer charempid;

    /**
    * 员工id
    */
    private String empid;

    /**
    * 角色id
    */
    private Integer characterid;

    public Integer getCharempid() {
        return charempid;
    }

    public void setCharempid(Integer charempid) {
        this.charempid = charempid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public Integer getCharacterid() {
        return characterid;
    }

    public void setCharacterid(Integer characterid) {
        this.characterid = characterid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", charempid=").append(charempid);
        sb.append(", empid=").append(empid);
        sb.append(", characterid=").append(characterid);
        sb.append("]");
        return sb.toString();
    }
}