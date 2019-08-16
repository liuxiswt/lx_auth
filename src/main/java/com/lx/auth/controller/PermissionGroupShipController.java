package com.lx.auth.controller;

import com.lx.auth.model.dto.PermissionGroupShip;
import com.lx.auth.service.PermissionGroupShipService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PermissionGroupShip)表控制层
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
@RestController
@RequestMapping("permissionGroupShip")
public class PermissionGroupShipController {
    /**
     * 服务对象
     */
    @Resource
    private PermissionGroupShipService permissionGroupShipService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PermissionGroupShip selectOne(Long id) {
        return this.permissionGroupShipService.queryById(id);
    }

}