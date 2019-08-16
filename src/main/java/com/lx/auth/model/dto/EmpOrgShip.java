package com.lx.auth.model.dto;

import java.io.Serializable;

/**
 * (EmpOrgShip)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:01:58
 */
public class EmpOrgShip implements Serializable {
    private static final long serialVersionUID = -22459549914717022L;
    //员工id
    private String employeeId;
    //职位id
    private String positionId;
    //部门id
    private String deptId;
    //组织id
    private String orgId;


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

}