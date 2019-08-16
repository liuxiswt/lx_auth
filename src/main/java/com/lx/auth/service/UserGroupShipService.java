package com.lx.auth.service;

import com.lx.auth.model.dto.UserGroupShip;
import java.util.List;

/**
 * (UserGroupShip)表服务接口
 *
 * @author makejava
 * @since 2019-08-15 19:02:01
 */
public interface UserGroupShipService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    UserGroupShip queryById(Long userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserGroupShip> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userGroupShip 实例对象
     * @return 实例对象
     */
    UserGroupShip insert(UserGroupShip userGroupShip);

    /**
     * 修改数据
     *
     * @param userGroupShip 实例对象
     * @return 实例对象
     */
    UserGroupShip update(UserGroupShip userGroupShip);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Long userId);

}