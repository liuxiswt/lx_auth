package com.lx.auth.mapper;

import com.lx.auth.model.dto.OrderGood;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (OrderGood)表数据库访问层
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
public interface OrderGoodDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderGood queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderGood> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderGood 实例对象
     * @return 对象列表
     */
    List<OrderGood> queryAll(OrderGood orderGood);

    /**
     * 新增数据
     *
     * @param orderGood 实例对象
     * @return 影响行数
     */
    int insert(OrderGood orderGood);

    /**
     * 修改数据
     *
     * @param orderGood 实例对象
     * @return 影响行数
     */
    int update(OrderGood orderGood);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}