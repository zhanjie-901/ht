package com.ht.bean;

public class TuitionType {
    /**
    * 主键
    */
    private Integer tuitiontypeid;

    /**
    * 收费项名称
    */
    private String typename;

    /**
    * 金额
    */
    private String typemoney;

    /**
    * 备注
    */
    private String remark;

    public Integer getTuitiontypeid() {
        return tuitiontypeid;
    }

    public void setTuitiontypeid(Integer tuitiontypeid) {
        this.tuitiontypeid = tuitiontypeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getTypemoney() {
        return typemoney;
    }

    public void setTypemoney(String typemoney) {
        this.typemoney = typemoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tuitiontypeid=").append(tuitiontypeid);
        sb.append(", typename=").append(typename);
        sb.append(", typemoney=").append(typemoney);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}