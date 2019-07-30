package com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy;

/**
 * 订单处理器的抽象类
 */
public abstract class AbstractHandler {
    public abstract String handle(String type);
}
