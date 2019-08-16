package com.lx.auth.service.impl;

import com.lx.auth.model.dto.PermissionGroupShip;
import com.lx.auth.mapper.PermissionGroupShipDao;
import com.lx.auth.service.PermissionGroupShipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PermissionGroupShip)表服务实现类
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
@Service("permissionGroupShipService")
public class PermissionGroupShipServiceImpl implements PermissionGroupShipService {
    @Resource
    private PermissionGroupShipDao permissionGroupShipDao;

    /**
     * 通过ID查询单条数据
     *
     * @param permissionId 主键
     * @return 实例对象
     */
    @Override
    public PermissionGroupShip queryById(Long permissionId) {
        return this.permissionGroupShipDao.queryById(permissionId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PermissionGroupShip> queryAllByLimit(int offset, int limit) {
        return this.permissionGroupShipDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param permissionGroupShip 实例对象
     * @return 实例对象
     */
    @Override
    public PermissionGroupShip insert(PermissionGroupShip permissionGroupShip) {
        this.permissionGroupShipDao.insert(permissionGroupShip);
        return permissionGroupShip;
    }

    /**
     * 修改数据
     *
     * @param permissionGroupShip 实例对象
     * @return 实例对象
     */
    @Override
    public PermissionGroupShip update(PermissionGroupShip permissionGroupShip) {
        this.permissionGroupShipDao.update(permissionGroupShip);
        return this.queryById(permissionGroupShip.getPermissionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param permissionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long permissionId) {
        return this.permissionGroupShipDao.deleteById(permissionId) > 0;
    }
}