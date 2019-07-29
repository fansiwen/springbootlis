package com.fsw.lis.springbootlis.pattern.strategy;

public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("优惠券活动，满300-30");
    }
}
