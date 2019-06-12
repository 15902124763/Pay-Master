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
@Table(name = "pay_channel", schema = "pay", catalog = "")
public class PayChannelDO {
    private int id;
    private String apiKey;
    private String appId;
    private String certFileId;
    private String mchId;
    private String mchKey;
    private String payChannelName;
    private String payTypeCode;
    private int payTypeId;
    private String payTypeName;
    private String platformKey;
    private int queryChannelId;
    private String signType;
    private short status;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "api_key")
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Basic
    @Column(name = "app_id")
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "cert_file_id")
    public String getCertFileId() {
        return certFileId;
    }

    public void setCertFileId(String certFileId) {
        this.certFileId = certFileId;
    }

    @Basic
    @Column(name = "mch_id")
    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    @Basic
    @Column(name = "mch_key")
    public String getMchKey() {
        return mchKey;
    }

    public void setMchKey(String mchKey) {
        this.mchKey = mchKey;
    }

    @Basic
    @Column(name = "pay_channel_name")
    public String getPayChannelName() {
        return payChannelName;
    }

    public void setPayChannelName(String payChannelName) {
        this.payChannelName = payChannelName;
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
    @Column(name = "pay_type_id")
    public int getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(int payTypeId) {
        this.payTypeId = payTypeId;
    }

    @Basic
    @Column(name = "pay_type_name")
    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }

    @Basic
    @Column(name = "platform_key")
    public String getPlatformKey() {
        return platformKey;
    }

    public void setPlatformKey(String platformKey) {
        this.platformKey = platformKey;
    }

    @Basic
    @Column(name = "query_channel_id")
    public int getQueryChannelId() {
        return queryChannelId;
    }

    public void setQueryChannelId(int queryChannelId) {
        this.queryChannelId = queryChannelId;
    }

    @Basic
    @Column(name = "sign_type")
    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    @Basic
    @Column(name = "status")
    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayChannelDO that = (PayChannelDO) o;
        return id == that.id &&
                payTypeId == that.payTypeId &&
                queryChannelId == that.queryChannelId &&
                status == that.status &&
                Objects.equals(apiKey, that.apiKey) &&
                Objects.equals(appId, that.appId) &&
                Objects.equals(certFileId, that.certFileId) &&
                Objects.equals(mchId, that.mchId) &&
                Objects.equals(mchKey, that.mchKey) &&
                Objects.equals(payChannelName, that.payChannelName) &&
                Objects.equals(payTypeCode, that.payTypeCode) &&
                Objects.equals(payTypeName, that.payTypeName) &&
                Objects.equals(platformKey, that.platformKey) &&
                Objects.equals(signType, that.signType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apiKey, appId, certFileId, mchId, mchKey, payChannelName, payTypeCode, payTypeId, payTypeName, platformKey, queryChannelId, signType, status);
    }
}