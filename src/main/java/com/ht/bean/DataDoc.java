package com.ht.bean;

public class DataDoc {
    /**
    * 主键，标识列，自动生成
    */
    private Integer docid;

    /**
    * 资料名称
    */
    private String dataname;

    /**
    * 资料地址
    */
    private String url;

    /**
    * 上传时间
    */
    private String optime;

    /**
    * 备注
    */
    private String remark;

    /**
    * 上传人员
    */
    private Integer empid;

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public String getDataname() {
        return dataname;
    }

    public void setDataname(String dataname) {
        this.dataname = dataname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOptime() {
        return optime;
    }

    public void setOptime(String optime) {
        this.optime = optime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", docid=").append(docid);
        sb.append(", dataname=").append(dataname);
        sb.append(", url=").append(url);
        sb.append(", optime=").append(optime);
        sb.append(", remark=").append(remark);
        sb.append(", empid=").append(empid);
        sb.append("]");
        return sb.toString();
    }
}