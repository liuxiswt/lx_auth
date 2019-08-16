package com.lx.auth.model.dto;

import java.io.Serializable;

/**
 * (PermissionGroupShip)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
public class PermissionGroupShip implements Serializable {
    private static final long serialVersionUID = 794307511351686698L;
    //权限id
    private Long permissionId;
    //权限组id
    private Long permissionGroupId;


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