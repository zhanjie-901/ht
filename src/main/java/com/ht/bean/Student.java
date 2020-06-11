package com.ht.bean;

public class Student {
    /**
    * 学生主键
    */
    private Integer studid;

    /**
    * 登录密码
    */
    private String password;

    /**
    * 学生姓名
    */
    private String stuname;

    /**
    * 毕业学校
    */
    private String middleschool;

    /**
    * 性别
    */
    private String sex;

    /**
    * 年龄
    */
    private Integer age;

    /**
    * 出生年月
    */
    private String birthday;

    /**
    * 学生电话
    */
    private String phone;

    /**
    * 家庭住址
    */
    private String addr;

    /**
    * 班级外键 id
    */
    private Integer clazz;

    /**
    * 宿舍外键 id
    */
    private Integer huor;

    /**
    * 入学时间
    */
    private String entertime;

    /**
    * 介绍老师
    */
    private String introduretech;

    /**
    * 学生状态
    */
    private Integer stat;

    /**
    * 民族
    */
    private String nation;

    /**
    * 籍贯
    */
    private String natives;

    /**
    * 户口性质（1.农业  2.非农）
    */
    private Integer residence;

    /**
    * 身份证号
    */
    private String cardid;

    /**
    * 就读专业
    */
    private String professional;

    /**
    * 专业类别（1.中技  2.高技  3.3+2）
    */
    private Integer prolevel;

    /**
    * 学习类别
    */
    private Integer studytype;

    /**
    * 家长姓名
    */
    private String parents;

    /**
    * 家长电话
    */
    private String parentsphone;

    /**
    * 老师电话
    */
    private String intrphone;

    /**
    * 面试人
    */
    private String audition;

    /**
    * 面试人意见
    */
    private String auditionoption;

    /**
    * 是否中专（1.否   2.是）
    */
    private Integer isvocational;

    /**
    * 中专学校
    */
    private String vocationalsch;

    /**
    * 中专学籍（1.已退 2.保留）
    */
    private Integer vocationalflag;

    /**
    * 省录取号
    */
    private Integer enrollno;

    /**
    * 录取成绩
    */
    private String score;

    /**
    * 是否低保
    */
    private String dibao;

    /**
    * 生源类型
    */
    private String sourcetype;

    /**
    * 担保人
    */
    private String guarantee;

    /**
    * 是否当兵
    */
    private String soldier;

    /**
    * 报名号
    */
    private String registration;

    /**
    * 是否住校
    */
    private String zhuxiao;

    /**
    * 备注
    */
    private String remark;

    /**
    * 退学
    */
    private String tuixue;

    /**
    * 休学
    */
    private String xiuxue;

    /**
    * 学号
    */
    private String stuno;

    /**
    * 是否送电脑
    */
    private String computer;

    /**
    * 是否领用
    */
    private String collar;

    /**
    * 助学金
    */
    private String grants;

    public Integer getStudid() {
        return studid;
    }

    public void setStudid(Integer studid) {
        this.studid = studid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getMiddleschool() {
        return middleschool;
    }

    public void setMiddleschool(String middleschool) {
        this.middleschool = middleschool;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getClazz() {
        return clazz;
    }

    public void setClazz(Integer clazz) {
        this.clazz = clazz;
    }

    public Integer getHuor() {
        return huor;
    }

    public void setHuor(Integer huor) {
        this.huor = huor;
    }

    public String getEntertime() {
        return entertime;
    }

    public void setEntertime(String entertime) {
        this.entertime = entertime;
    }

    public String getIntroduretech() {
        return introduretech;
    }

    public void setIntroduretech(String introduretech) {
        this.introduretech = introduretech;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNatives() {
        return natives;
    }

    public void setNatives(String natives) {
        this.natives = natives;
    }

    public Integer getResidence() {
        return residence;
    }

    public void setResidence(Integer residence) {
        this.residence = residence;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public Integer getProlevel() {
        return prolevel;
    }

    public void setProlevel(Integer prolevel) {
        this.prolevel = prolevel;
    }

    public Integer getStudytype() {
        return studytype;
    }

    public void setStudytype(Integer studytype) {
        this.studytype = studytype;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }

    public String getParentsphone() {
        return parentsphone;
    }

    public void setParentsphone(String parentsphone) {
        this.parentsphone = parentsphone;
    }

    public String getIntrphone() {
        return intrphone;
    }

    public void setIntrphone(String intrphone) {
        this.intrphone = intrphone;
    }

    public String getAudition() {
        return audition;
    }

    public void setAudition(String audition) {
        this.audition = audition;
    }

    public String getAuditionoption() {
        return auditionoption;
    }

    public void setAuditionoption(String auditionoption) {
        this.auditionoption = auditionoption;
    }

    public Integer getIsvocational() {
        return isvocational;
    }

    public void setIsvocational(Integer isvocational) {
        this.isvocational = isvocational;
    }

    public String getVocationalsch() {
        return vocationalsch;
    }

    public void setVocationalsch(String vocationalsch) {
        this.vocationalsch = vocationalsch;
    }

    public Integer getVocationalflag() {
        return vocationalflag;
    }

    public void setVocationalflag(Integer vocationalflag) {
        this.vocationalflag = vocationalflag;
    }

    public Integer getEnrollno() {
        return enrollno;
    }

    public void setEnrollno(Integer enrollno) {
        this.enrollno = enrollno;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDibao() {
        return dibao;
    }

    public void setDibao(String dibao) {
        this.dibao = dibao;
    }

    public String getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getSoldier() {
        return soldier;
    }

    public void setSoldier(String soldier) {
        this.soldier = soldier;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getZhuxiao() {
        return zhuxiao;
    }

    public void setZhuxiao(String zhuxiao) {
        this.zhuxiao = zhuxiao;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTuixue() {
        return tuixue;
    }

    public void setTuixue(String tuixue) {
        this.tuixue = tuixue;
    }

    public String getXiuxue() {
        return xiuxue;
    }

    public void setXiuxue(String xiuxue) {
        this.xiuxue = xiuxue;
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    public String getGrants() {
        return grants;
    }

    public void setGrants(String grants) {
        this.grants = grants;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studid=").append(studid);
        sb.append(", password=").append(password);
        sb.append(", stuname=").append(stuname);
        sb.append(", middleschool=").append(middleschool);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", birthday=").append(birthday);
        sb.append(", phone=").append(phone);
        sb.append(", addr=").append(addr);
        sb.append(", clazz=").append(clazz);
        sb.append(", huor=").append(huor);
        sb.append(", entertime=").append(entertime);
        sb.append(", introduretech=").append(introduretech);
        sb.append(", stat=").append(stat);
        sb.append(", nation=").append(nation);
        sb.append(", natives=").append(natives);
        sb.append(", residence=").append(residence);
        sb.append(", cardid=").append(cardid);
        sb.append(", professional=").append(professional);
        sb.append(", prolevel=").append(prolevel);
        sb.append(", studytype=").append(studytype);
        sb.append(", parents=").append(parents);
        sb.append(", parentsphone=").append(parentsphone);
        sb.append(", intrphone=").append(intrphone);
        sb.append(", audition=").append(audition);
        sb.append(", auditionoption=").append(auditionoption);
        sb.append(", isvocational=").append(isvocational);
        sb.append(", vocationalsch=").append(vocationalsch);
        sb.append(", vocationalflag=").append(vocationalflag);
        sb.append(", enrollno=").append(enrollno);
        sb.append(", score=").append(score);
        sb.append(", dibao=").append(dibao);
        sb.append(", sourcetype=").append(sourcetype);
        sb.append(", guarantee=").append(guarantee);
        sb.append(", soldier=").append(soldier);
        sb.append(", registration=").append(registration);
        sb.append(", zhuxiao=").append(zhuxiao);
        sb.append(", remark=").append(remark);
        sb.append(", tuixue=").append(tuixue);
        sb.append(", xiuxue=").append(xiuxue);
        sb.append(", stuno=").append(stuno);
        sb.append(", computer=").append(computer);
        sb.append(", collar=").append(collar);
        sb.append(", grants=").append(grants);
        sb.append("]");
        return sb.toString();
    }
}