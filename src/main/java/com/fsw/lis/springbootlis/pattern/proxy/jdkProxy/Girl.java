package com.fsw.lis.springbootlis.pattern.proxy.jdkProxy;

/**
 * 想找对象的小妹妹
 */
public class Girl implements Human{
    @Override
    public void findLove() {
        System.out.println("身高一米八");
        System.out.println("有钱，有房，有车");
        System.out.println("特别帅！");
    }
}
