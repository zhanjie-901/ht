package com.ht.bean;

public class CharModule {
    /**
    * 主键，标识列，自动生成
    */
    private Integer charmoduleid;

    /**
    * 管理系统权限
    */
    private Integer moduleid;

    /**
    * 关联角色表
    */
    private Integer characterid;

    public Integer getCharmoduleid() {
        return charmoduleid;
    }

    public void setCharmoduleid(Integer charmoduleid) {
        this.charmoduleid = charmoduleid;
    }

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
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
        sb.append(", charmoduleid=").append(charmoduleid);
        sb.append(", moduleid=").append(moduleid);
        sb.append(", characterid=").append(characterid);
        sb.append("]");
        return sb.toString();
    }
}