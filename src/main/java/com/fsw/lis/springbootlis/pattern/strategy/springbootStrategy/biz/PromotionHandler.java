package com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.biz;

import com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.AbstractHandler;
import com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.HandlerType;
import org.springframework.stereotype.Component;

/**
 * 促销订单
 */
@Component
@HandlerType("3")
public class PromotionHandler extends AbstractHandler {
    @Override
    public String handle(String type) {
        return "正在处理促销订单";
    }
}
