package com.lx.auth.model.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:01:51
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 508734899846958444L;
    
    private Long id;
    //部门编码
    private String deptCode;
    //所属组织id
    private Long orgId;
    //部门名称
    private String departmentName;
    //上级部门id
    private Long deptParentId;
    //部门负责人
    private String manager;
    //创建人
    private String createBy;
    //修改人
    private String updateBy;
    //生效日期
    private Date effectiveDate;
    //失效日期
    private Date expireDate;
    //部门职能

    private String description;
    //状态 默认1正常 0停运
    private Integer status;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
    //是否删除 默认1未删除 0已删除
    private Integer noDeleted;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getDeptParentId() {
        return deptParentId;
    }

    public void setDeptParentId(Long deptParentId) {
        this.deptParentId = deptParentId;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
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

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
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

    public Integer getNoDeleted() {
        return noDeleted;
    }

    public void setNoDeleted(Integer noDeleted) {
        this.noDeleted = noDeleted;
    }

}