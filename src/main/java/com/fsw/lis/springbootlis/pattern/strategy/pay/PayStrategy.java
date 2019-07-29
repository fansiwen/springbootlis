package com.fsw.lis.springbootlis.pattern.strategy.pay;

/**
 * 支付方式的抽象类
 */
public abstract class PayStrategy {
    //获得支付类型
    public abstract String getName();
    //查询余额
    public abstract double queryBalance(String uid);

    //扣款支付
    public PayState pay(String uid,Double amout){
        if(queryBalance(uid)<amout){
            return new PayState(500,"交易失败","余额不足");
        }
        return new PayState(200,"支付成功","支付金额"+amout);
    }

}
