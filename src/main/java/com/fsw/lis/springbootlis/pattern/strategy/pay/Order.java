package com.fsw.lis.springbootlis.pattern.strategy.pay;

/**
 * 订单类
 */
public class Order {
    private String uid;
    private String orderId;
    private double amout;

    public Order(String uid, String orderId, double amout) {
        this.uid = uid;
        this.orderId = orderId;
        this.amout = amout;
    }

    public PayState pay(){
        return pay(PayStrategyManage.DEFAULT_PAY);
    }
    public PayState pay(String payKey){
        PayStrategy payStrategy = PayStrategyManage.getPayStrategy(payKey);
        System.out.println("欢迎使用"+payStrategy.getName());
        System.out.println("本次交易的金额为"+amout+",开始扣款");
        return payStrategy.pay(uid,amout);
    }
}
