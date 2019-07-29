package com.fsw.lis.springbootlis.pattern.strategy;

import java.util.HashMap;

/**
 * 策略工厂
 */
public class PromotionStrategyFactory {
    private static HashMap<String,PromotionStrategy> promotionStrategyMap = new HashMap<String,PromotionStrategy>();
    static {
        promotionStrategyMap.put(PromotonKey.COUPON,new CouponStrategy());
        promotionStrategyMap.put(PromotonKey.CASHBACK,new CashBackStrategy());
        promotionStrategyMap.put(PromotonKey.GROUPBUY,new GroupByStrategy());
    }
    private static final PromotionStrategy NON = new EmptyStrategy();
    public PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = promotionStrategyMap.get(promotionKey);
        return promotionStrategy==null?NON:promotionStrategy;
    }

    private interface PromotonKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }
}
