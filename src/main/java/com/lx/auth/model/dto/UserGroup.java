package com.lx.auth.model.dto;

import java.util.Date;
import java.io.Serializable;

/**
 * (UserGroup)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
public class UserGroup implements Serializable {
    private static final long serialVersionUID = 586297916559534605L;
    //主键
    private Long id;
    //用户组编码
    private String userGroupCode;
    //用户组名称
    private String groupName;
    //用户组描述
    private String remaker;
    //创建人
    private String createBy;
    //修改人
    private String updateBy;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
    //是否删除 1未删除 0已删除
    private Integer noDeteled;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserGroupCode() {
        return userGroupCode;
    }

    public void setUserGroupCode(String userGroupCode) {
        this.userGroupCode = userGroupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getRemaker() {
        return remaker;
    }

    public void setRemaker(String remaker) {
        this.remaker = remaker;
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