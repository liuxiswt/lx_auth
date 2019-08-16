package com.lx.auth.service;

import com.lx.auth.model.dto.Organization;
import java.util.List;

/**
 * (Organization)表服务接口
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
public interface OrganizationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Organization queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Organization> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param organization 实例对象
     * @return 实例对象
     */
    Organization insert(Organization organization);

    /**
     * 修改数据
     *
     * @param organization 实例对象
     * @return 实例对象
     */
    Organization update(Organization organization);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}