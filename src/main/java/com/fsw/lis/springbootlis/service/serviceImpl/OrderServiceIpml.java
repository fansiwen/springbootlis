package com.fsw.lis.springbootlis.service.serviceImpl;

import com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.AbstractHandler;
import com.fsw.lis.springbootlis.pattern.strategy.springbootStrategy.HandlerContext;
import com.fsw.lis.springbootlis.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceIpml implements IOrderService {
    @Autowired
    private HandlerContext context;
    @Override
    public String handle(String type) {
        AbstractHandler instance = context.getInstance(type);
        return instance.handle(type);
    }
}
