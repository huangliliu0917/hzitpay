package com.hzit.pay.service.service;

import com.hzit.pay.service.model.PayOrder;

/**
 * 支付流水相关
 */
public interface IPayOrderService {


    /**
     * 创建支付流水
     * @param payOrder
     * @return
     */
    public int createPayOrder(PayOrder payOrder);
}