package com.lx.auth.mapper;

import com.lx.auth.model.dto.UserGroupShip;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (UserGroupShip)表数据库访问层
 *
 * @author makejava
 * @since 2019-08-15 19:02:01
 */
public interface UserGroupShipDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    UserGroupShip queryById(Long userId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserGroupShip> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userGroupShip 实例对象
     * @return 对象列表
     */
    List<UserGroupShip> queryAll(UserGroupShip userGroupShip);

    /**
     * 新增数据
     *
     * @param userGroupShip 实例对象
     * @return 影响行数
     */
    int insert(UserGroupShip userGroupShip);

    /**
     * 修改数据
     *
     * @param userGroupShip 实例对象
     * @return 影响行数
     */
    int update(UserGroupShip userGroupShip);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 影响行数
     */
    int deleteById(Long userId);

}