package com.lx.auth.controller;

import com.lx.auth.model.dto.Organization;
import com.lx.auth.service.OrganizationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Organization)表控制层
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
@RestController
@RequestMapping("organization")
public class OrganizationController {
    /**
     * 服务对象
     */
    @Resource
    private OrganizationService organizationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Organization selectOne(Long id) {
        return this.organizationService.queryById(id);
    }

}