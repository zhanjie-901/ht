package com.ht.bean;

public class StudentFloor {
    /**
    * 楼栋主键id
    */
    private Integer floorid;

    /**
    * 楼栋名称
    */
    private String floorname;

    public Integer getFloorid() {
        return floorid;
    }

    public void setFloorid(Integer floorid) {
        this.floorid = floorid;
    }

    public String getFloorname() {
        return floorname;
    }

    public void setFloorname(String floorname) {
        this.floorname = floorname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", floorid=").append(floorid);
        sb.append(", floorname=").append(floorname);
        sb.append("]");
        return sb.toString();
    }
}