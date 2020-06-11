package com.ht.bean;

public class FamilyInfo {
    /**
    * 主键，标识列，自动生成
    */
    private Integer familyid;

    /**
    * 关联Emp表empid字段
    */
    private Integer empid;

    /**
    * 联系人名称
    */
    private String contactname;

    /**
    * 与员工关系
    */
    private String relationship;

    /**
    * 联系电话
    */
    private String phone;

    /**
    * 说明
    */
    private String remark;

    public Integer getFamilyid() {
        return familyid;
    }

    public void setFamilyid(Integer familyid) {
        this.familyid = familyid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        sb.append(", familyid=").append(familyid);
        sb.append(", empid=").append(empid);
        sb.append(", contactname=").append(contactname);
        sb.append(", relationship=").append(relationship);
        sb.append(", phone=").append(phone);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}