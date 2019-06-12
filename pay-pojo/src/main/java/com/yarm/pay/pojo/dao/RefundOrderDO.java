package com.yarm.pay.pojo.dao;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/11
 * Time:14:49
 * Des:
 */
@Entity
@Table(name = "refund_order", schema = "pay", catalog = "")
public class RefundOrderDO {
    private int id;
    private Integer payChannelId;
    private String payTypeCode;
    private String payOrderNo;
    private String tradePayNo;
    private String refundOrderNo;
    private String tradeRefundNo;
    private String payId;
    private Integer payAmount;
    private String refundId;
    private Integer refundAmount;
    private Short status;
    private String errorCode;
    private String errorMsg;
    private Timestamp refundTime;
    private String merchantId;
    private String tradeType;
    private String notifyUrl;
    private String refundReason;
    private Timestamp createTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pay_channel_id")
    public Integer getPayChannelId() {
        return payChannelId;
    }

    public void setPayChannelId(Integer payChannelId) {
        this.payChannelId = payChannelId;
    }

    @Basic
    @Column(name = "pay_type_code")
    public String getPayTypeCode() {
        return payTypeCode;
    }

    public void setPayTypeCode(String payTypeCode) {
        this.payTypeCode = payTypeCode;
    }

    @Basic
    @Column(name = "pay_order_no")
    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    @Basic
    @Column(name = "trade_pay_no")
    public String getTradePayNo() {
        return tradePayNo;
    }

    public void setTradePayNo(String tradePayNo) {
        this.tradePayNo = tradePayNo;
    }

    @Basic
    @Column(name = "refund_order_no")
    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    @Basic
    @Column(name = "trade_refund_no")
    public String getTradeRefundNo() {
        return tradeRefundNo;
    }

    public void setTradeRefundNo(String tradeRefundNo) {
        this.tradeRefundNo = tradeRefundNo;
    }

    @Basic
    @Column(name = "pay_id")
    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    @Basic
    @Column(name = "pay_amount")
    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    @Basic
    @Column(name = "refund_id")
    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    @Basic
    @Column(name = "refund_amount")
    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    @Basic
    @Column(name = "status")
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "error_code")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Basic
    @Column(name = "error_msg")
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Basic
    @Column(name = "refund_time")
    public Timestamp getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Timestamp refundTime) {
        this.refundTime = refundTime;
    }

    @Basic
    @Column(name = "merchant_id")
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    @Basic
    @Column(name = "trade_type")
    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    @Basic
    @Column(name = "notify_url")
    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Basic
    @Column(name = "refund_reason")
    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RefundOrderDO that = (RefundOrderDO) o;
        return id == that.id &&
                Objects.equals(payChannelId, that.payChannelId) &&
                Objects.equals(payTypeCode, that.payTypeCode) &&
                Objects.equals(payOrderNo, that.payOrderNo) &&
                Objects.equals(tradePayNo, that.tradePayNo) &&
                Objects.equals(refundOrderNo, that.refundOrderNo) &&
                Objects.equals(tradeRefundNo, that.tradeRefundNo) &&
                Objects.equals(payId, that.payId) &&
                Objects.equals(payAmount, that.payAmount) &&
                Objects.equals(refundId, that.refundId) &&
                Objects.equals(refundAmount, that.refundAmount) &&
                Objects.equals(status, that.status) &&
                Objects.equals(errorCode, that.errorCode) &&
                Objects.equals(errorMsg, that.errorMsg) &&
                Objects.equals(refundTime, that.refundTime) &&
                Objects.equals(merchantId, that.merchantId) &&
                Objects.equals(tradeType, that.tradeType) &&
                Objects.equals(notifyUrl, that.notifyUrl) &&
                Objects.equals(refundReason, that.refundReason) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, payChannelId, payTypeCode, payOrderNo, tradePayNo, refundOrderNo, tradeRefundNo, payId, payAmount, refundId, refundAmount, status, errorCode, errorMsg, refundTime, merchantId, tradeType, notifyUrl, refundReason, createTime);
    }
}