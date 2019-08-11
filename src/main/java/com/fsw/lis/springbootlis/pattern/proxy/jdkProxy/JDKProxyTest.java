package com.fsw.lis.springbootlis.pattern.proxy.jdkProxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理测试类
 */
public class JDKProxyTest {
    public static void main(String[] args) throws Exception {
        Human human = (Human) new MeiPoJDKProxy().getInstance(new Girl());
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Human.class});
        FileOutputStream fileOutputStream = new FileOutputStream("E://$Proxy0.class");
        fileOutputStream.write(bytes);
        fileOutputStream.close();
        human.findLove();

    }
}
