package com.fsw.lis.springbootlis.pattern.strategy.pay;
//交易状态
public class PayState {
    private int code;
    private Object data;
    private String message;

    public PayState(int code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    @Override
    public String toString() {
        return ("支付状态["+code+"],"+message+",交易详情"+data);
    }
}
