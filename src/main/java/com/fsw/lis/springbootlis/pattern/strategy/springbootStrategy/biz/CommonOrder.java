package com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.biz;

import com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.AbstractHandler;
import com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.HandlerType;
import org.springframework.stereotype.Component;


@Component
@HandlerType("1")
public class CommonOrder extends AbstractHandler {
    @Override
    public String handle(String type) {
        return "处理普通订单";
    }
}
