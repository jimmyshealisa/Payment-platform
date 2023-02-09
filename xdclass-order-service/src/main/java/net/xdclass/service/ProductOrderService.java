package net.xdclass.service;

import net.xdclass.model.OrderMessage;
import net.xdclass.request.ConfirmOrderRequest;
import net.xdclass.util.JsonData;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public interface ProductOrderService {

    /**
     * 创建订单
     * @param orderRequest
     * @return
     */
    JsonData confirmOrder(ConfirmOrderRequest orderRequest);

    /**
     * 查询订单状态
     * @param outTradeNo
     * @return
     */
    String queryProductOrderState(String outTradeNo);

    /**
     * 队列监听，定时关单
     * @param orderMessage
     * @return
     */
    boolean closeProductOrder(OrderMessage orderMessage);
}
