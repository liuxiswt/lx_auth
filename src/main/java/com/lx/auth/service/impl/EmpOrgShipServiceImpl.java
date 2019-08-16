package com.lx.auth.service.impl;

import com.lx.auth.model.dto.EmpOrgShip;
import com.lx.auth.mapper.EmpOrgShipDao;
import com.lx.auth.service.EmpOrgShipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EmpOrgShip)表服务实现类
 *
 * @author makejava
 * @since 2019-08-15 19:01:58
 */
@Service("empOrgShipService")
public class EmpOrgShipServiceImpl implements EmpOrgShipService {
    @Resource
    private EmpOrgShipDao empOrgShipDao;

    /**
     * 通过ID查询单条数据
     *
     * @param employeeId 主键
     * @return 实例对象
     */
    @Override
    public EmpOrgShip queryById(String employeeId) {
        return this.empOrgShipDao.queryById(employeeId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<EmpOrgShip> queryAllByLimit(int offset, int limit) {
        return this.empOrgShipDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param empOrgShip 实例对象
     * @return 实例对象
     */
    @Override
    public EmpOrgShip insert(EmpOrgShip empOrgShip) {
        this.empOrgShipDao.insert(empOrgShip);
        return empOrgShip;
    }

    /**
     * 修改数据
     *
     * @param empOrgShip 实例对象
     * @return 实例对象
     */
    @Override
    public EmpOrgShip update(EmpOrgShip empOrgShip) {
        this.empOrgShipDao.update(empOrgShip);
        return this.queryById(empOrgShip.getEmployeeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param employeeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String employeeId) {
        return this.empOrgShipDao.deleteById(employeeId) > 0;
    }
}