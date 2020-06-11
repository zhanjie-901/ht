package com.ht.bean;

public class SetSystem {
    /**
    * 主键，标识列，自动生成
    */
    private Integer setid;

    /**
    * App地址
    */
    private String appname;

    /**
    * APP更新包地址
    */
    private String appurl;

    /**
    * 版本号
    */
    private String appurl2;

    /**
    * 名称
    */
    private String appversion;

    public Integer getSetid() {
        return setid;
    }

    public void setSetid(Integer setid) {
        this.setid = setid;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getAppurl() {
        return appurl;
    }

    public void setAppurl(String appurl) {
        this.appurl = appurl;
    }

    public String getAppurl2() {
        return appurl2;
    }

    public void setAppurl2(String appurl2) {
        this.appurl2 = appurl2;
    }

    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", setid=").append(setid);
        sb.append(", appname=").append(appname);
        sb.append(", appurl=").append(appurl);
        sb.append(", appurl2=").append(appurl2);
        sb.append(", appversion=").append(appversion);
        sb.append("]");
        return sb.toString();
    }
}