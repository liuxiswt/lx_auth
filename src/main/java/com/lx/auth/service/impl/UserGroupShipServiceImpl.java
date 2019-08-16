package com.lx.auth.service.impl;

import com.lx.auth.model.dto.UserGroupShip;
import com.lx.auth.mapper.UserGroupShipDao;
import com.lx.auth.service.UserGroupShipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserGroupShip)表服务实现类
 *
 * @author makejava
 * @since 2019-08-15 19:02:01
 */
@Service("userGroupShipService")
public class UserGroupShipServiceImpl implements UserGroupShipService {
    @Resource
    private UserGroupShipDao userGroupShipDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public UserGroupShip queryById(Long userId) {
        return this.userGroupShipDao.queryById(userId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserGroupShip> queryAllByLimit(int offset, int limit) {
        return this.userGroupShipDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userGroupShip 实例对象
     * @return 实例对象
     */
    @Override
    public UserGroupShip insert(UserGroupShip userGroupShip) {
        this.userGroupShipDao.insert(userGroupShip);
        return userGroupShip;
    }

    /**
     * 修改数据
     *
     * @param userGroupShip 实例对象
     * @return 实例对象
     */
    @Override
    public UserGroupShip update(UserGroupShip userGroupShip) {
        this.userGroupShipDao.update(userGroupShip);
        return this.queryById(userGroupShip.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long userId) {
        return this.userGroupShipDao.deleteById(userId) > 0;
    }
}