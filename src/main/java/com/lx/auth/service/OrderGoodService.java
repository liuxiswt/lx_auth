package com.lx.auth.service;

import com.lx.auth.model.dto.OrderGood;
import java.util.List;

/**
 * (OrderGood)表服务接口
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
public interface OrderGoodService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderGood queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderGood> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderGood 实例对象
     * @return 实例对象
     */
    OrderGood insert(OrderGood orderGood);

    /**
     * 修改数据
     *
     * @param orderGood 实例对象
     * @return 实例对象
     */
    OrderGood update(OrderGood orderGood);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}