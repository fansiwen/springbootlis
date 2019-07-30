package com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.biz;

import com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.AbstractHandler;
import com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.HandlerType;
import org.springframework.stereotype.Component;

/**
 * 团体订单
 */
@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler {
    @Override
    public String handle(String type) {
        return "正在处理团体订单";
    }
}
