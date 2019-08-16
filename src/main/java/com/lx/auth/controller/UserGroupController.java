package com.lx.auth.controller;

import com.lx.auth.model.dto.UserGroup;
import com.lx.auth.service.UserGroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UserGroup)表控制层
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
@RestController
@RequestMapping("userGroup")
public class UserGroupController {
    /**
     * 服务对象
     */
    @Resource
    private UserGroupService userGroupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserGroup selectOne(Long id) {
        return this.userGroupService.queryById(id);
    }

}