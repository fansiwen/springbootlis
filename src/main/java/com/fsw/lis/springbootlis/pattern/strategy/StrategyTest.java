package com.fsw.lis.springbootlis.pattern.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        PromotionStrategyFactory factory = new PromotionStrategyFactory();
        PromotionStrategy promotionStrategy = factory.getPromotionStrategy("CASHBACK");
        PromotionActivity activity = new PromotionActivity(promotionStrategy);
        activity.execute();
    }
}
