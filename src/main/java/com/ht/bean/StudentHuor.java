package com.ht.bean;

public class StudentHuor {
    /**
    * 宿舍主键id
    */
    private Integer hourid;

    /**
    * 宿舍房号（508）
    */
    private String huorname;

    /**
    * 宿舍地址
    */
    private String addr;

    /**
    * 宿舍人数
    */
    private Integer count;

    /**
    * 楼栋id 外键
    */
    private Integer floorid;

    /**
    * 床位数
    */
    private Integer numberbeds;

    /**
    * 序号
    */
    private Integer huoeiddsc;

    public Integer getHourid() {
        return hourid;
    }

    public void setHourid(Integer hourid) {
        this.hourid = hourid;
    }

    public String getHuorname() {
        return huorname;
    }

    public void setHuorname(String huorname) {
        this.huorname = huorname;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getFloorid() {
        return floorid;
    }

    public void setFloorid(Integer floorid) {
        this.floorid = floorid;
    }

    public Integer getNumberbeds() {
        return numberbeds;
    }

    public void setNumberbeds(Integer numberbeds) {
        this.numberbeds = numberbeds;
    }

    public Integer getHuoeiddsc() {
        return huoeiddsc;
    }

    public void setHuoeiddsc(Integer huoeiddsc) {
        this.huoeiddsc = huoeiddsc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hourid=").append(hourid);
        sb.append(", huorname=").append(huorname);
        sb.append(", addr=").append(addr);
        sb.append(", count=").append(count);
        sb.append(", floorid=").append(floorid);
        sb.append(", numberbeds=").append(numberbeds);
        sb.append(", huoeiddsc=").append(huoeiddsc);
        sb.append("]");
        return sb.toString();
    }
}