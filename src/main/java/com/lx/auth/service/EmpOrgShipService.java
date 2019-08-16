package com.lx.auth.service;

import com.lx.auth.model.dto.EmpOrgShip;
import java.util.List;

/**
 * (EmpOrgShip)表服务接口
 *
 * @author makejava
 * @since 2019-08-15 19:01:58
 */
public interface EmpOrgShipService {

    /**
     * 通过ID查询单条数据
     *
     * @param employeeId 主键
     * @return 实例对象
     */
    EmpOrgShip queryById(String employeeId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<EmpOrgShip> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param empOrgShip 实例对象
     * @return 实例对象
     */
    EmpOrgShip insert(EmpOrgShip empOrgShip);

    /**
     * 修改数据
     *
     * @param empOrgShip 实例对象
     * @return 实例对象
     */
    EmpOrgShip update(EmpOrgShip empOrgShip);

    /**
     * 通过主键删除数据
     *
     * @param employeeId 主键
     * @return 是否成功
     */
    boolean deleteById(String employeeId);

}