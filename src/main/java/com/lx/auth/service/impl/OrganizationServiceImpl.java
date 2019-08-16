package com.lx.auth.service.impl;

import com.lx.auth.model.dto.Organization;
import com.lx.auth.mapper.OrganizationDao;
import com.lx.auth.service.OrganizationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Organization)表服务实现类
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
@Service("organizationService")
public class OrganizationServiceImpl implements OrganizationService {
    @Resource
    private OrganizationDao organizationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Organization queryById(Long id) {
        return this.organizationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Organization> queryAllByLimit(int offset, int limit) {
        return this.organizationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param organization 实例对象
     * @return 实例对象
     */
    @Override
    public Organization insert(Organization organization) {
        this.organizationDao.insert(organization);
        return organization;
    }

    /**
     * 修改数据
     *
     * @param organization 实例对象
     * @return 实例对象
     */
    @Override
    public Organization update(Organization organization) {
        this.organizationDao.update(organization);
        return this.queryById(organization.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.organizationDao.deleteById(id) > 0;
    }
}