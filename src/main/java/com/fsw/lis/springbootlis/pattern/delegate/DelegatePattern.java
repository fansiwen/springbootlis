package com.fsw.lis.springbootlis.pattern.delegate;

import sun.applet.Main;

import java.lang.management.BufferPoolMXBean;

/**
 *委派模式的测试类
 */
public class DelegatePattern {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("登录",new Leader());

    }
}
