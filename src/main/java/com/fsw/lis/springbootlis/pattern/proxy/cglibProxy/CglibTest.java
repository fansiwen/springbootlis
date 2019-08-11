package com.fsw.lis.springbootlis.pattern.proxy.cglibProxy;

/**
 * cglib动态代理测试类
 */
public class CglibTest {
    public static void main(String[] args) {
        Boy instance = (Boy) new MeiPoCglib().getInstance(Boy.class);
        instance.findLove();

    }
}
