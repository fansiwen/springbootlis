package com.fsw.lis.springbootlis.pattern.strategy.pay;

public class Test {
    public static void main(String[] args) {
        Order order = new Order("1","20190729",324.25);
        System.out.println(order.pay(PayStrategyManage.ALI_PAY));
    }
}
