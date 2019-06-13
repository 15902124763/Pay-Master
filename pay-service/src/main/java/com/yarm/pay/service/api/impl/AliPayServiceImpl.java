package com.yarm.pay.service.api.impl;

import com.yarm.pay.pojo.api.request.RequestQuery;
import com.yarm.pay.service.api.AbstractPayService;
import com.yarm.pay.service.api.PayService;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/13
 * Time:21:04
 * Des:
 */
@Service
public class AliPayServiceImpl extends AbstractPayService implements PayService {
    @Override
    public void aliPay(RequestQuery requestQuery) {

    }
}