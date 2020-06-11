package com.ht.bean;

public class Household {
    /**
    * 主键，标识列，自动生成
    */
    private Integer cityid;

    /**
    * 地理名称
    */
    private String cityname;

    /**
    * 省,市,县
    */
    private String citytype;

    private String py;

    private String wb;

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCitytype() {
        return citytype;
    }

    public void setCitytype(String citytype) {
        this.citytype = citytype;
    }

    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    public String getWb() {
        return wb;
    }

    public void setWb(String wb) {
        this.wb = wb;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cityid=").append(cityid);
        sb.append(", cityname=").append(cityname);
        sb.append(", citytype=").append(citytype);
        sb.append(", py=").append(py);
        sb.append(", wb=").append(wb);
        sb.append("]");
        return sb.toString();
    }
}