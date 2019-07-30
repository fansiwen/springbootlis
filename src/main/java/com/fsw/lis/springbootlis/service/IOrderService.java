package com.fsw.lis.springbootlis.service;

/**
 * 订单接口
 */
public interface IOrderService {
    /**
     * 根据不同的订单类型采用不同的逻辑
     * @param type
     * @return
     */
    public String handle(String type);
}
