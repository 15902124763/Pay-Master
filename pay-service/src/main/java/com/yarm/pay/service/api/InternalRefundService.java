package com.yarm.pay.service.api;


import com.yarm.pay.pojo.api.response.RefundResponse;
import com.yarm.pay.pojo.service.PayChannelBO;
import com.yarm.pay.pojo.service.RefundOrderBO;

/**
 *
 */
public interface InternalRefundService {
    /**
     * 实际退款接口，  如果退款失败，一定要抛出异常，在RefundService中如果有异常则返回 业务方。
     *
     * @param payChannel
     * @param refundOrder
     * @return
     */
    Object refund(PayChannelBO payChannel, RefundOrderBO refundOrder);

    /**
     * 异步通知时候使用，  目前支付宝调用此方法
     *
     * @return
     */
    RefundResponse parse(PayChannelBO channel, RefundOrderBO refundOrder, String notify);
}
