package com.lx.auth.model.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * (Permission)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = 168899695328250871L;
    //主键
    private Long id;
    //权限编码
    private String code;
    //权限名称
    private String name;
    //权限类型
    private Integer type;
    //请求类型
    private String action;
    //页面连接
    private String url;
    //上级权限id
    private Long parentId;
    //排序 越小优先级越高
    private Integer sequence;
    //状态 默认1正常
    private Integer status;
    //是否可视 1可视 0不可视
    private Integer visible;
    //备注
    private String remark;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
    //创建人
    private String createBy;
    //修改人
    private String updateBy;
    //是否删除 默认1未删除 0已删除
    private Integer noDeleted;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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