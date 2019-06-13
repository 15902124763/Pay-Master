package com.yarm.pay.service.api;

import com.yarm.pay.pojo.api.request.RequestQuery;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/13
 * Time:21:04
 * Des:
 */
public interface PayService {
    void aliPay(RequestQuery requestQuery);
}