package com.yarm.pay.dao.jpa;

import com.yarm.pay.pojo.dao.PayMerchantDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/10
 * Time:20:44
 * Des:
 */
public interface PayMerchantDao extends JpaRepository<PayMerchantDO,Integer> {

    PayMerchantDO selectByMerchantId(String merchantId);
}