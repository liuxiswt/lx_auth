package com.lx.auth.mapper;

import com.lx.auth.model.dto.Organization;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Organization)表数据库访问层
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
public interface OrganizationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Organization queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Organization> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param organization 实例对象
     * @return 对象列表
     */
    List<Organization> queryAll(Organization organization);

    /**
     * 新增数据
     *
     * @param organization 实例对象
     * @return 影响行数
     */
    int insert(Organization organization);

    /**
     * 修改数据
     *
     * @param organization 实例对象
     * @return 影响行数
     */
    int update(Organization organization);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}