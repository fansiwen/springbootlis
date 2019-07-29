package com.fsw.lis.springbootlis.pattern.strategy;

public class GroupByStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("团购大优惠，三人成团");
    }
}
