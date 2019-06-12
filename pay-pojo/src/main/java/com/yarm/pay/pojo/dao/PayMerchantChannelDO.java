package com.yarm.pay.pojo.dao;

import javax.persistence.*;
import java.util.Objects;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/11
 * Time:14:48
 * Des:
 */
@Entity
@Table(name = "pay_merchant_channel", schema = "pay", catalog = "")
public class PayMerchantChannelDO {
    private int id;
    private Integer payTypeId;
    private Integer payMerchantId;
    private int payChannelId;
    private String tradeType;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pay_type_id")
    public Integer getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(Integer payTypeId) {
        this.payTypeId = payTypeId;
    }

    @Basic
    @Column(name = "pay_merchant_id")
    public Integer getPayMerchantId() {
        return payMerchantId;
    }

    public void setPayMerchantId(Integer payMerchantId) {
        this.payMerchantId = payMerchantId;
    }

    @Basic
    @Column(name = "pay_channel_id")
    public int getPayChannelId() {
        return payChannelId;
    }

    public void setPayChannelId(int payChannelId) {
        this.payChannelId = payChannelId;
    }

    @Basic
    @Column(name = "trade_type")
    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayMerchantChannelDO that = (PayMerchantChannelDO) o;
        return id == that.id &&
                payChannelId == that.payChannelId &&
                Objects.equals(payTypeId, that.payTypeId) &&
                Objects.equals(payMerchantId, that.payMerchantId) &&
                Objects.equals(tradeType, that.tradeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, payTypeId, payMerchantId, payChannelId, tradeType);
    }
}