package com.fsw.lis.springbootlis.pattern.strategy.pay;

public class UnonPay extends PayStrategy{
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 100;
    }
}
