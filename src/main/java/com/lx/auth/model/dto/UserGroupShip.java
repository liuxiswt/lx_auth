package com.lx.auth.model.dto;

import java.io.Serializable;

/**
 * (UserGroupShip)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
public class UserGroupShip implements Serializable {
    private static final long serialVersionUID = -34084554644725457L;
    //用户id
    private Long userId;
    //组id
    private Long groupId;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

}