package com.lx.auth.service;

import com.lx.auth.model.dto.PermissionGroupShip;
import java.util.List;

/**
 * (PermissionGroupShip)表服务接口
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
public interface PermissionGroupShipService {

    /**
     * 通过ID查询单条数据
     *
     * @param permissionId 主键
     * @return 实例对象
     */
    PermissionGroupShip queryById(Long permissionId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PermissionGroupShip> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param permissionGroupShip 实例对象
     * @return 实例对象
     */
    PermissionGroupShip insert(PermissionGroupShip permissionGroupShip);

    /**
     * 修改数据
     *
     * @param permissionGroupShip 实例对象
     * @return 实例对象
     */
    PermissionGroupShip update(PermissionGroupShip permissionGroupShip);

    /**
     * 通过主键删除数据
     *
     * @param permissionId 主键
     * @return 是否成功
     */
    boolean deleteById(Long permissionId);

}