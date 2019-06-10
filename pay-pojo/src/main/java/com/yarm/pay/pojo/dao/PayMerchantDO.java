package com.yarm.pay.pojo.dao;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/10
 * Time:20:47
 * Des:
 */
@Entity
@Table(name = "pay_merchant")
@EntityListeners(AuditingEntityListener.class)
public class PayMerchantDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//支持mysql主键自增长
    private int id;
    @Column(name = "name", nullable = false,columnDefinition = "varchar(255) COMMENT '商户名'")
    private String name;
    @Column(name = "status", nullable = false, columnDefinition = "TINYINT(4) COMMENT '1正常，2,不可用'")
    private int status; // 1正常，2 不可用
    @Column(name = "merchant_id", nullable = false,columnDefinition = "varchar(19) COMMENT '商户Id'")
    private String merchantId; // 商户Id
    @Column(name = "api_key", nullable = false,columnDefinition = "varchar(32) COMMENT '秘钥'")
    private String apiKey; // 秘钥

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}