package com.fsw.lis.springbootlis.pattern.proxy.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 基于cglib的媒婆动态代理
 */
public class MeiPoCglib implements MethodInterceptor {
    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //要把哪个类设置为新生成类的父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object invoke = methodProxy.invokeSuper(o,objects);
        after();
        return invoke;
    }

    private void after() {
        System.out.println("cglib动态代理后置通知");
    }

    private void before() {
        System.out.println("cglib动态代理前置通知");
    }
}
