package com.ht.bean;

import java.math.BigDecimal;

public class TestDetails {
    /**
    * 主键，标识列，自动生成
    */
    private Integer sdetailsid;

    /**
    * 报考学生名称
    */
    private String detailsname;

    /**
    * 收款方式
    */
    private String paymentmethod;

    /**
    * 部门Id
    */
    private Integer empid;

    /**
    * 专业层次
    */
    private String profession;

    /**
    * 实缴金额
    */
    private BigDecimal totmoney;

    /**
    * 考生Id
    */
    private Integer adultid;

    /**
    * 备注
    */
    private String remark;

    /**
    * 收款类别Id
    */
    private Integer tuitiontypeid;

    /**
    * 状态
    */
    private String typestatus;

    public Integer getSdetailsid() {
        return sdetailsid;
    }

    public void setSdetailsid(Integer sdetailsid) {
        this.sdetailsid = sdetailsid;
    }

    public String getDetailsname() {
        return detailsname;
    }

    public void setDetailsname(String detailsname) {
        this.detailsname = detailsname;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public BigDecimal getTotmoney() {
        return totmoney;
    }

    public void setTotmoney(BigDecimal totmoney) {
        this.totmoney = totmoney;
    }

    public Integer getAdultid() {
        return adultid;
    }

    public void setAdultid(Integer adultid) {
        this.adultid = adultid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTuitiontypeid() {
        return tuitiontypeid;
    }

    public void setTuitiontypeid(Integer tuitiontypeid) {
        this.tuitiontypeid = tuitiontypeid;
    }

    public String getTypestatus() {
        return typestatus;
    }

    public void setTypestatus(String typestatus) {
        this.typestatus = typestatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sdetailsid=").append(sdetailsid);
        sb.append(", detailsname=").append(detailsname);
        sb.append(", paymentmethod=").append(paymentmethod);
        sb.append(", empid=").append(empid);
        sb.append(", profession=").append(profession);
        sb.append(", totmoney=").append(totmoney);
        sb.append(", adultid=").append(adultid);
        sb.append(", remark=").append(remark);
        sb.append(", tuitiontypeid=").append(tuitiontypeid);
        sb.append(", typestatus=").append(typestatus);
        sb.append("]");
        return sb.toString();
    }
}