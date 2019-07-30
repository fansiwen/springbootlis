package com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy;

import com.fsw.lis.springbootlis.utils.BeanTool;

import java.util.Map;

/**
 * 订单策略分发作用
 */
public class HandlerContext {
    //用于存储策略的map
    private Map<String,Class> handlerMap;

    public HandlerContext(Map<String,Class>handlerMap){
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type){
        //根据type到缓存的map中获取对应的订单处理器的类
        Class clazz = handlerMap.get(type);
        if(clazz==null){
            throw new IllegalArgumentException("not found handler for type"+type);
        }
        //通过工具类返回订单处理器
        return (AbstractHandler) BeanTool.getBean(clazz);
    }
}
