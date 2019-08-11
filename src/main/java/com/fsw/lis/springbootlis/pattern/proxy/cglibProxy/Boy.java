package com.fsw.lis.springbootlis.pattern.proxy.cglibProxy;

import javax.xml.bind.SchemaOutputResolver;

/**
 * 基于cglib动态代理的被代理类不需要实现其他接口
 */
public class Boy {
    public void findLove(){
        System.out.println("我想找一个肤白貌美的");
    }
}
