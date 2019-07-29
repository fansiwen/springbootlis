package com.fsw.lis.springbootlis.pattern.strategy;

public class CashBackStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现活动，买的多返的多");
    }
}
