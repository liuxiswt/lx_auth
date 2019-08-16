package com.lx.auth.controller;

import com.lx.auth.model.dto.EmpOrgShip;
import com.lx.auth.service.EmpOrgShipService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (EmpOrgShip)表控制层
 *
 * @author makejava
 * @since 2019-08-15 19:01:58
 */
@RestController
@RequestMapping("empOrgShip")
public class EmpOrgShipController {
    /**
     * 服务对象
     */
    @Resource
    private EmpOrgShipService empOrgShipService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EmpOrgShip selectOne(String id) {
        return this.empOrgShipService.queryById(id);
    }

}