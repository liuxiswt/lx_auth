package com.lx.auth.model.dto;

import java.io.Serializable;

/**
 * (UserRole)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:02:01
 */
public class UserRole implements Serializable {
    private static final long serialVersionUID = 599242056171720293L;
    //角色id
    private Long roleId;
    //数据权限的组织id
    private Long orgId;
    //用户id
    private Long userId;
    //职位id
    private Long positionId;
    //用户组id
    private Long userGroupId;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Long userGroupId) {
        this.userGroupId = userGroupId;
    }

}