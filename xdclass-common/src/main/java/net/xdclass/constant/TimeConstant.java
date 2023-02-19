package net.xdclass.constant;

public class TimeConstant {

    /**
     * 支付订单的有效时长，超过未支付则关闭订单
     *
     * 订单超时，毫秒，默认30分钟
     */
    public static final long ODER_PAY_TIMEOUT_MILLS = 30*30*1000;
}
