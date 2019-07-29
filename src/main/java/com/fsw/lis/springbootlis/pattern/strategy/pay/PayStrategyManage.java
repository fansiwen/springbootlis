package com.fsw.lis.springbootlis.pattern.strategy.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付策略管理
 */
public class PayStrategyManage {
    public static final String ALI_PAY="AliPay";
    public static final String JD_PAY= "JDPay";
    public static final String WX_PAY= "WXPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String DEFAULT_PAY = "WXPay";

    private static Map<String,PayStrategy> map = new HashMap<String,PayStrategy>();

    static {
        map.put(ALI_PAY,new AliPay());
        map.put(JD_PAY,new JDPay());
        map.put(WX_PAY,new WXPay());
        map.put(UNION_PAY,new UnonPay());
    }

    public static PayStrategy getPayStrategy(String payKey){
        if(!map.containsKey(payKey)){
            return map.get(DEFAULT_PAY);
        }
        return map.get(payKey);
    }
}
