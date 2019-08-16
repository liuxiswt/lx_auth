package com.lx.auth.model.dto;

import java.io.Serializable;

/**
 * (RolePermission)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
public class RolePermission implements Serializable {
    private static final long serialVersionUID = -92646709227380318L;
    //角色id
    private Long roleId;
    //单个权限id
    private Long permissionId;
    //权限组id
    private Long permissionGroupId;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public Long getPermissionGroupId() {
        return permissionGroupId;
    }

    public void setPermissionGroupId(Long permissionGroupId) {
        this.permissionGroupId = permissionGroupId;
    }

}