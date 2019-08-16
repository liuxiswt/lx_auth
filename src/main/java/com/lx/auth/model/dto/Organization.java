package com.lx.auth.model.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * (Organization)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
public class Organization implements Serializable {
    private static final long serialVersionUID = -13151216458449064L;
    //主键
    private Long id;
    //组织编码
    private String orgCode;
    //组织名称
    private String orgName;
    //联系方式
    private String orgPhone;
    //负责人
    private String manager;
    //介绍描述
    private String description;
    //状态 默认1正常运行
    private Integer status;
    //创建人
    private String createBy;
    //修改人
    private String updateBy;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
    //默认1未删除 0已删除
    private Integer noDeteled;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgPhone() {
        return orgPhone;
    }

    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getNoDeteled() {
        return noDeteled;
    }

    public void setNoDeteled(Integer noDeteled) {
        this.noDeteled = noDeteled;
    }

}