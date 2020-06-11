package com.ht.bean;

public class Characters {
    /**
    * 主键，标识列，自动生成
    */
    private Integer characterid;

    /**
    * 角色名称
    */
    private String charactername;

    /**
    * 关联岗位表,给岗位设置权限
    */
    private Integer postid;

    public Integer getCharacterid() {
        return characterid;
    }

    public void setCharacterid(Integer characterid) {
        this.characterid = characterid;
    }

    public String getCharactername() {
        return charactername;
    }

    public void setCharactername(String charactername) {
        this.charactername = charactername;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", characterid=").append(characterid);
        sb.append(", charactername=").append(charactername);
        sb.append(", postid=").append(postid);
        sb.append("]");
        return sb.toString();
    }
}