package com.yarm.pay.pojo.dao;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/11
 * Time:14:48
 * Des:
 */
@Entity
@Table(name = "pay_order", schema = "pay", catalog = "")
public class PayOrderDO {
    private int id;
    private String payTypeCode;
    private String payOrderNo;
    private String tradePayNo;
    private String prePayId;
    private String payId;
    private String userIp;
    private Integer payAmount;
    private Timestamp payTime;
    private Short status;
    private String errorCode;
    private String errorMsg;
    private Timestamp startTime;
    private Timestamp expireTime;
    private String openId;
    private String buyerLogonId;
    private String notifyUrl;
    private String extra;
    private String subject;
    private String detail;
    private String codeUrl;
    private String merchantId;
    private String tradeType;
    private String returnUrl;
    private Integer refundAmount;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "pre_pay_id")
    public String getPrePayId() {
        return prePayId;
    }

    public void setPrePayId(String prePayId) {
        this.prePayId = prePayId;
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
    @Column(name = "user_ip")
    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
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
    @Column(name = "pay_time")
    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
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
    @Column(name = "start_time")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "expire_time")
    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    @Basic
    @Column(name = "open_id")
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Basic
    @Column(name = "buyer_logon_id")
    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
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
    @Column(name = "extra")
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Basic
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "code_url")
    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
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
    @Column(name = "return_url")
    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    @Basic
    @Column(name = "refund_amount")
    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayOrderDO that = (PayOrderDO) o;
        return id == that.id &&
                Objects.equals(payTypeCode, that.payTypeCode) &&
                Objects.equals(payOrderNo, that.payOrderNo) &&
                Objects.equals(tradePayNo, that.tradePayNo) &&
                Objects.equals(prePayId, that.prePayId) &&
                Objects.equals(payId, that.payId) &&
                Objects.equals(userIp, that.userIp) &&
                Objects.equals(payAmount, that.payAmount) &&
                Objects.equals(payTime, that.payTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(errorCode, that.errorCode) &&
                Objects.equals(errorMsg, that.errorMsg) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(expireTime, that.expireTime) &&
                Objects.equals(openId, that.openId) &&
                Objects.equals(buyerLogonId, that.buyerLogonId) &&
                Objects.equals(notifyUrl, that.notifyUrl) &&
                Objects.equals(extra, that.extra) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(detail, that.detail) &&
                Objects.equals(codeUrl, that.codeUrl) &&
                Objects.equals(merchantId, that.merchantId) &&
                Objects.equals(tradeType, that.tradeType) &&
                Objects.equals(returnUrl, that.returnUrl) &&
                Objects.equals(refundAmount, that.refundAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, payTypeCode, payOrderNo, tradePayNo, prePayId, payId, userIp, payAmount, payTime, status, errorCode, errorMsg, startTime, expireTime, openId, buyerLogonId, notifyUrl, extra, subject, detail, codeUrl, merchantId, tradeType, returnUrl, refundAmount);
    }
}