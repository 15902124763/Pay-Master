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
@Table(name = "pay_merchant", schema = "pay", catalog = "")
public class PayMerchantDO {
    private int id;
    private String apiKey;
    private String merchantId;
    private String name;
    private Byte status;

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
    @Column(name = "merchant_id")
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayMerchantDO that = (PayMerchantDO) o;
        return id == that.id &&
                Objects.equals(apiKey, that.apiKey) &&
                Objects.equals(merchantId, that.merchantId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apiKey, merchantId, name, status);
    }
}