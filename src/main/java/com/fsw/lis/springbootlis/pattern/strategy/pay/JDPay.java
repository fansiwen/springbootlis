package com.fsw.lis.springbootlis.pattern.strategy.pay;

public class JDPay extends PayStrategy{
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    public double queryBalance(String uid) {
        return 500;
    }
}
