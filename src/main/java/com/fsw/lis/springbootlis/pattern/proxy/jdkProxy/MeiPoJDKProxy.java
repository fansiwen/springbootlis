package com.fsw.lis.springbootlis.pattern.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 媒婆作为有意向相亲的人的代理
 */
public class MeiPoJDKProxy implements InvocationHandler {
    /**
     * 持有被代理对象的引用
     */
    private Human human;
    public Object getInstance(Human human){
        this.human = human;
        Class<?> clazz = human.getClass();
        //通过反射机制获得类加载器以及类的接口
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object =  method.invoke(this.human,args);
        afterPrxy();
        return object;
    }

    private void afterPrxy() {
        System.out.println("代理增强，后置通知");
    }

    private void before() {
        System.out.println("代理增强，前置通知");
    }
}
