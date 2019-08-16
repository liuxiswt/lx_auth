package com.lx.auth.service;

import com.lx.auth.model.dto.UserGroup;
import java.util.List;

/**
 * (UserGroup)表服务接口
 *
 * @author makejava
 * @since 2019-08-15 19:02:00
 */
public interface UserGroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserGroup queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserGroup> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userGroup 实例对象
     * @return 实例对象
     */
    UserGroup insert(UserGroup userGroup);

    /**
     * 修改数据
     *
     * @param userGroup 实例对象
     * @return 实例对象
     */
    UserGroup update(UserGroup userGroup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}