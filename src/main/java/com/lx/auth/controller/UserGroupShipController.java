package com.lx.auth.controller;

import com.lx.auth.model.dto.UserGroupShip;
import com.lx.auth.service.UserGroupShipService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UserGroupShip)表控制层
 *
 * @author makejava
 * @since 2019-08-15 19:02:01
 */
@RestController
@RequestMapping("userGroupShip")
public class UserGroupShipController {
    /**
     * 服务对象
     */
    @Resource
    private UserGroupShipService userGroupShipService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserGroupShip selectOne(Long id) {
        return this.userGroupShipService.queryById(id);
    }

}