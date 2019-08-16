package com.lx.auth.mapper;

import com.lx.auth.model.dto.PermissionGroupShip;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PermissionGroupShip)表数据库访问层
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
public interface PermissionGroupShipDao {

    /**
     * 通过ID查询单条数据
     *
     * @param permissionId 主键
     * @return 实例对象
     */
    PermissionGroupShip queryById(Long permissionId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PermissionGroupShip> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param permissionGroupShip 实例对象
     * @return 对象列表
     */
    List<PermissionGroupShip> queryAll(PermissionGroupShip permissionGroupShip);

    /**
     * 新增数据
     *
     * @param permissionGroupShip 实例对象
     * @return 影响行数
     */
    int insert(PermissionGroupShip permissionGroupShip);

    /**
     * 修改数据
     *
     * @param permissionGroupShip 实例对象
     * @return 影响行数
     */
    int update(PermissionGroupShip permissionGroupShip);

    /**
     * 通过主键删除数据
     *
     * @param permissionId 主键
     * @return 影响行数
     */
    int deleteById(Long permissionId);

}