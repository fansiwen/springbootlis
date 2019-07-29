package com.fsw.lis.springbootlis.pattern.strategy.pay;

public class WXPay extends PayStrategy{
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 300;
    }
}
