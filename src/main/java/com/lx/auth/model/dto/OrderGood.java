package com.lx.auth.model.dto;

import java.io.Serializable;

/**
 * (OrderGood)实体类
 *
 * @author makejava
 * @since 2019-08-15 19:01:59
 */
public class OrderGood implements Serializable {
    private static final long serialVersionUID = -26278836082014445L;
    //主键
    private Long id;
    //订单编号
    private String orderNo;
    //商品id
    private Long goodId;
    //商品名称
    private String goodName;
    //商品单价
    private Double goodPrice;
    //商品数量
    private Integer goodCount;


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

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Integer getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
    }

}