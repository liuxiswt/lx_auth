package com.lx.auth.service.impl;

import com.lx.auth.model.dto.OrderGood;
import com.lx.auth.mapper.OrderGoodDao;
import com.lx.auth.service.OrderGoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderGood)表服务实现类
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
@Service("orderGoodService")
public class OrderGoodServiceImpl implements OrderGoodService {
    @Resource
    private OrderGoodDao orderGoodDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderGood queryById(Long id) {
        return this.orderGoodDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderGood> queryAllByLimit(int offset, int limit) {
        return this.orderGoodDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderGood 实例对象
     * @return 实例对象
     */
    @Override
    public OrderGood insert(OrderGood orderGood) {
        this.orderGoodDao.insert(orderGood);
        return orderGood;
    }

    /**
     * 修改数据
     *
     * @param orderGood 实例对象
     * @return 实例对象
     */
    @Override
    public OrderGood update(OrderGood orderGood) {
        this.orderGoodDao.update(orderGood);
        return this.queryById(orderGood.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderGoodDao.deleteById(id) > 0;
    }
}