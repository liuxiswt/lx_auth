package com.lx.auth.controller;

import com.lx.auth.model.dto.PermissionGroup;
import com.lx.auth.service.PermissionGroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PermissionGroup)表控制层
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
@RestController
@RequestMapping("permissionGroup")
public class PermissionGroupController {
    /**
     * 服务对象
     */
    @Resource
    private PermissionGroupService permissionGroupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PermissionGroup selectOne(Long id) {
        return this.permissionGroupService.queryById(id);
    }

}