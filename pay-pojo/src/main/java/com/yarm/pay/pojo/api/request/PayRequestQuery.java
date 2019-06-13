package com.yarm.pay.pojo.api.request;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/12
 * Time:19:44
 * Des:支付请求
 */
public class PayRequestQuery extends RequestQuery {
    // 订单id
    private String orderId;
    // 支付类型 WECHAT_PAY(1, "微信"), ALI_PAY(2, "支付宝");
    private int payTypeCode;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getPayTypeCode() {
        return payTypeCode;
    }

    public void setPayTypeCode(int payTypeCode) {
        this.payTypeCode = payTypeCode;
    }

    @Override
    public String toString() {
        return "PayRequestQuery{" +
                "orderId='" + orderId + '\'' +
                ", payTypeCode=" + payTypeCode +
                '}';
    }
}