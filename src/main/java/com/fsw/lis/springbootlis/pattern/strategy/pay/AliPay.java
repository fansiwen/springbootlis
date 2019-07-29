package com.fsw.lis.springbootlis.pattern.strategy.pay;

public class AliPay extends PayStrategy{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 900;
    }
}
