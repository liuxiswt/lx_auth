package com.lx.auth.controller;

import com.lx.auth.model.dto.OrderGood;
import com.lx.auth.service.OrderGoodService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OrderGood)表控制层
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
@RestController
@RequestMapping("orderGood")
public class OrderGoodController {
    /**
     * 服务对象
     */
    @Resource
    private OrderGoodService orderGoodService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrderGood selectOne(Long id) {
        return this.orderGoodService.queryById(id);
    }

}