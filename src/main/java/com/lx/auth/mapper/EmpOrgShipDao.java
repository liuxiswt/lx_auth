package com.lx.auth.mapper;

import com.lx.auth.model.dto.EmpOrgShip;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (EmpOrgShip)表数据库访问层
 *
 * @author makejava
 * @since 2019-08-15 19:01:58
 */
public interface EmpOrgShipDao {

    /**
     * 通过ID查询单条数据
     *
     * @param employeeId 主键
     * @return 实例对象
     */
    EmpOrgShip queryById(String employeeId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<EmpOrgShip> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param empOrgShip 实例对象
     * @return 对象列表
     */
    List<EmpOrgShip> queryAll(EmpOrgShip empOrgShip);

    /**
     * 新增数据
     *
     * @param empOrgShip 实例对象
     * @return 影响行数
     */
    int insert(EmpOrgShip empOrgShip);

    /**
     * 修改数据
     *
     * @param empOrgShip 实例对象
     * @return 影响行数
     */
    int update(EmpOrgShip empOrgShip);

    /**
     * 通过主键删除数据
     *
     * @param employeeId 主键
     * @return 影响行数
     */
    int deleteById(String employeeId);

}