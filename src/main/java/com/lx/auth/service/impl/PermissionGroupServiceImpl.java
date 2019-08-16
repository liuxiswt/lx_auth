package com.lx.auth.service.impl;

import com.lx.auth.model.dto.PermissionGroup;
import com.lx.auth.mapper.PermissionGroupDao;
import com.lx.auth.service.PermissionGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (PermissionGroup)表服务实现类
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
@Service("permissionGroupService")
public class PermissionGroupServiceImpl implements PermissionGroupService {
    @Resource
    private PermissionGroupDao permissionGroupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PermissionGroup queryById(Long id) {
        return this.permissionGroupDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PermissionGroup> queryAllByLimit(int offset, int limit) {
        return this.permissionGroupDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param permissionGroup 实例对象
     * @return 实例对象
     */
    @Override
    public PermissionGroup insert(PermissionGroup permissionGroup) {
        this.permissionGroupDao.insert(permissionGroup);
        return permissionGroup;
    }

    /**
     * 修改数据
     *
     * @param permissionGroup 实例对象
     * @return 实例对象
     */
    @Override
    public PermissionGroup update(PermissionGroup permissionGroup) {
        this.permissionGroupDao.update(permissionGroup);
        return this.queryById(permissionGroup.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.permissionGroupDao.deleteById(id) > 0;
    }
}