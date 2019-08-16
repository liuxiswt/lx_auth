package com.lx.auth.model.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * (Employee)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = -97268362338480180L;
    //主键
    private Long id;
    //员工编码
    private String employeeCode;
    //组织id
    private Long orgId;
    //员工名称
    private String name;
    //性别 男1 女0
    private Integer gender;
    //手机号
    private String phone;
    //生日
    private Date birthday;
    //入职日期（用于计算工龄）
    private Date hireDate;
    //公司邮箱
    private String companyEmail;
    //个人邮箱
    private String personalEmail;
    //首选证件所属国家
    private Long preferCountry;
    //证件号码
    private String cardNumber;
    //最高教育
    private Integer highestEducation;
    //是否结婚 1未婚 2已婚
    private Integer married;
    //国家
    private String country;
    //出生地
    private String birthplace;
    //民族
    private Integer nation;
    //政治面貌
    private Integer politicalStatus;
    //宗教信仰
    private Integer religiousFaith;
    //户口类别
    private Integer permResidenceClass;
    //户籍地址
    private String censusRegister;
    //居住地址
    private String homeAddress;
    //员工类别（正式员工 0 派遣员工 1 核心店员 2 临促人员 3 经销商 4 其他人员 5）
    private Integer type;
    //员工头像
    private String avatar;
    //紧急联系人姓名
    private String emerContactName;
    //紧急联系人电话
    private String emerContactPhone;
    //紧急联系人与员工关系
    private String emerContactRel;
    //紧急联系人地址
    private String emerContactAddr;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //创建人
    private String createBy;
    //更新人
    private String updateBy;
    //是否删除 默认1未删除 0已删除
    private Integer noDeleted;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public Long getPreferCountry() {
        return preferCountry;
    }

    public void setPreferCountry(Long preferCountry) {
        this.preferCountry = preferCountry;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(Integer highestEducation) {
        this.highestEducation = highestEducation;
    }

    public Integer getMarried() {
        return married;
    }

    public void setMarried(Integer married) {
        this.married = married;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public Integer getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(Integer politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public Integer getReligiousFaith() {
        return religiousFaith;
    }

    public void setReligiousFaith(Integer religiousFaith) {
        this.religiousFaith = religiousFaith;
    }

    public Integer getPermResidenceClass() {
        return permResidenceClass;
    }

    public void setPermResidenceClass(Integer permResidenceClass) {
        this.permResidenceClass = permResidenceClass;
    }

    public String getCensusRegister() {
        return censusRegister;
    }

    public void setCensusRegister(String censusRegister) {
        this.censusRegister = censusRegister;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmerContactName() {
        return emerContactName;
    }

    public void setEmerContactName(String emerContactName) {
        this.emerContactName = emerContactName;
    }

    public String getEmerContactPhone() {
        return emerContactPhone;
    }

    public void setEmerContactPhone(String emerContactPhone) {
        this.emerContactPhone = emerContactPhone;
    }

    public String getEmerContactRel() {
        return emerContactRel;
    }

    public void setEmerContactRel(String emerContactRel) {
        this.emerContactRel = emerContactRel;
    }

    public String getEmerContactAddr() {
        return emerContactAddr;
    }

    public void setEmerContactAddr(String emerContactAddr) {
        this.emerContactAddr = emerContactAddr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getNoDeleted() {
        return noDeleted;
    }

    public void setNoDeleted(Integer noDeleted) {
        this.noDeleted = noDeleted;
    }

}