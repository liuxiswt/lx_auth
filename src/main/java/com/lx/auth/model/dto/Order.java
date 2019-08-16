package com.lx.auth.model.dto;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -53257622771536840L;
    //主键
    private Long id;
    //订单编号
    private String orderNo;
    //总数
    private Integer count;
    //总金额
    private Double amount;
    //下单时间
    private Object orderDate;
    //下单人
    private String orderBy;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Object getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Object orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

}