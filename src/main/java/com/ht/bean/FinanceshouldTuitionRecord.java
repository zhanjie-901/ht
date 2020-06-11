package com.ht.bean;

public class FinanceshouldTuitionRecord {
    /**
    * 主键，标识列，自动生成
    */
    private Integer financeid;

    /**
    * 缴费日期/退款日期
    */
    private String financedate;

    /**
    * 关联学生表的主键
    */
    private Integer stuid;

    /**
    * 标示那个学期的收费”第一学期”，”第二学期”，”第三学期”，”第四学期”，
”第五学期”,外键关联到学期表主键

    */
    private Integer termid;

    /**
    * 支付方式
    */
    private String receipt;

    /**
    * 1:缴费，2：退款
    */
    private Integer financetype;

    /**
    * 实交金额(正)/退款金额(负)
    */
    private Double factmoney;

    /**
    * (收款人)员工id关联员工表
    */
    private Integer empid;

    /**
    * 说明
    */
    private String remark;

    /**
    * 1:有效，2：作废
    */
    private Integer invalid;

    /**
    * 关联收费项
    */
    private Integer tuitiontypeid;

    public Integer getFinanceid() {
        return financeid;
    }

    public void setFinanceid(Integer financeid) {
        this.financeid = financeid;
    }

    public String getFinancedate() {
        return financedate;
    }

    public void setFinancedate(String financedate) {
        this.financedate = financedate;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getTermid() {
        return termid;
    }

    public void setTermid(Integer termid) {
        this.termid = termid;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public Integer getFinancetype() {
        return financetype;
    }

    public void setFinancetype(Integer financetype) {
        this.financetype = financetype;
    }

    public Double getFactmoney() {
        return factmoney;
    }

    public void setFactmoney(Double factmoney) {
        this.factmoney = factmoney;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getInvalid() {
        return invalid;
    }

    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }

    public Integer getTuitiontypeid() {
        return tuitiontypeid;
    }

    public void setTuitiontypeid(Integer tuitiontypeid) {
        this.tuitiontypeid = tuitiontypeid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", financeid=").append(financeid);
        sb.append(", financedate=").append(financedate);
        sb.append(", stuid=").append(stuid);
        sb.append(", termid=").append(termid);
        sb.append(", receipt=").append(receipt);
        sb.append(", financetype=").append(financetype);
        sb.append(", factmoney=").append(factmoney);
        sb.append(", empid=").append(empid);
        sb.append(", remark=").append(remark);
        sb.append(", invalid=").append(invalid);
        sb.append(", tuitiontypeid=").append(tuitiontypeid);
        sb.append("]");
        return sb.toString();
    }
}