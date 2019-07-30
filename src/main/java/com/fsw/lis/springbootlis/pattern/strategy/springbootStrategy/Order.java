package com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 订单类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String code;
    private BigDecimal price;
    /**
     * 订单类型
     * 1-普通订单
     * 2-团购订单
     * 3-促销订单
     */
    private String type;
}
