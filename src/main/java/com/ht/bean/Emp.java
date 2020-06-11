package com.ht.bean;

public class Emp {
    /**
    * 主键,员工编号手动输入
    */
    private String empid;

    /**
    * 员工姓名
    */
    private String empname;

    /**
    * 关联dep表depid字段
    */
    private Integer depid;

    /**
    * 性别（男，女）
    */
    private String sex;

    /**
    * 出生日期
    */
    private String birthday;

    /**
    * 身份证号码（唯一）
    */
    private String cardno;

    /**
    * 籍贯
    */
    private String nation;

    /**
    * 手机号码
    */
    private String phone;

    /**
    * QQ号码
    */
    private String qqcode;

    /**
    * 微信号码
    */
    private String weixin;

    /**
    * 邮箱地址
    */
    private String email;

    /**
    * 婚姻状况（已婚，单身，离异，丧偶）
    */
    private String married;

    /**
    * 毕业学校
    */
    private String university;

    /**
    * 专业
    */
    private String major;

    /**
    * 学历
    */
    private String education;

    /**
    * 家庭地址
    */
    private String address;

    /**
    * 说明
    */
    private String remark;

    /**
    * 开户银行
    */
    private String bank;

    /**
    * 账户名称
    */
    private String accountname;

    /**
    * 账号
    */
    private String banknumber;

    /**
    * 支付宝账号(唯一）
    */
    private String alipay;

    /**
    * 入职日期
    */
    private String hireday;

    /**
    * 离职日期
    */
    private String fireday;

    /**
    * 登录密码
    */
    private String password;

    /**
    * 状态
    */
    private Integer status;

    /**
    * 职务id
    */
    private Integer postid;

    /**
    * 职务名称
    */
    private String postname;

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQqcode() {
        return qqcode;
    }

    public void setQqcode(String qqcode) {
        this.qqcode = qqcode;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(String banknumber) {
        this.banknumber = banknumber;
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    public String getHireday() {
        return hireday;
    }

    public void setHireday(String hireday) {
        this.hireday = hireday;
    }

    public String getFireday() {
        return fireday;
    }

    public void setFireday(String fireday) {
        this.fireday = fireday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empid=").append(empid);
        sb.append(", empname=").append(empname);
        sb.append(", depid=").append(depid);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", cardno=").append(cardno);
        sb.append(", nation=").append(nation);
        sb.append(", phone=").append(phone);
        sb.append(", qqcode=").append(qqcode);
        sb.append(", weixin=").append(weixin);
        sb.append(", email=").append(email);
        sb.append(", married=").append(married);
        sb.append(", university=").append(university);
        sb.append(", major=").append(major);
        sb.append(", education=").append(education);
        sb.append(", address=").append(address);
        sb.append(", remark=").append(remark);
        sb.append(", bank=").append(bank);
        sb.append(", accountname=").append(accountname);
        sb.append(", banknumber=").append(banknumber);
        sb.append(", alipay=").append(alipay);
        sb.append(", hireday=").append(hireday);
        sb.append(", fireday=").append(fireday);
        sb.append(", password=").append(password);
        sb.append(", status=").append(status);
        sb.append(", postid=").append(postid);
        sb.append(", postname=").append(postname);
        sb.append("]");
        return sb.toString();
    }
}