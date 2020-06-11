package com.ht.bean;

public class SystemLog {
    /**
    * 主键，标识列，自动生成
    */
    private Integer logid;

    /**
    * 关联员工表主键
    */
    private Integer empid;

    /**
    * ip地址
    */
    private String ipaddr;

    /**
    * 操作时间
    */
    private String optime;

    /**
    * 操作额数据表
    */
    private String tables;

    /**
    * 操作内容
    */
    private String msg;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public String getOptime() {
        return optime;
    }

    public void setOptime(String optime) {
        this.optime = optime;
    }

    public String getTables() {
        return tables;
    }

    public void setTables(String tables) {
        this.tables = tables;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logid=").append(logid);
        sb.append(", empid=").append(empid);
        sb.append(", ipaddr=").append(ipaddr);
        sb.append(", optime=").append(optime);
        sb.append(", tables=").append(tables);
        sb.append(", msg=").append(msg);
        sb.append("]");
        return sb.toString();
    }
}