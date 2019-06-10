package com.yarm.pay.service.platform;

import com.yarm.pay.dao.jpa.PayMerchantDao;
import com.yarm.pay.pojo.dao.PayMerchantDO;
import com.yarm.pay.pojo.service.PayMerchantBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/10
 * Time:20:38
 * Des:
 */
@Service
public class PayMerchantService {

    @Autowired
    private PayMerchantDao payMerchantDao;

    public PayMerchantBO getPayMerchant(String merchantId) {
        PayMerchantDO payMerchantDO = payMerchantDao.selectByMerchantId(merchantId);
        return null;
    }
}