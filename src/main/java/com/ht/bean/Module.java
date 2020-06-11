package com.ht.bean;

public class Module {
    /**
    * 主键，标识列，自动生成
    */
    private Integer moduleid;

    /**
    * 权限名称
    */
    private String modulename;

    /**
    * 根节点
    */
    private Integer root;

    /**
    * 访问控制器
    */
    private String controller;

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public Integer getRoot() {
        return root;
    }

    public void setRoot(Integer root) {
        this.root = root;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", moduleid=").append(moduleid);
        sb.append(", modulename=").append(modulename);
        sb.append(", root=").append(root);
        sb.append(", controller=").append(controller);
        sb.append("]");
        return sb.toString();
    }
}