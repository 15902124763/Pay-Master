package com.yarm.pay.controller.api;

import com.google.gson.Gson;
import com.yarm.pay.pojo.api.request.PayRequestQuery;
import com.yarm.pay.service.api.PayService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/10
 * Time:17:25
 * Des:统一入口
 */
@RestController
@RequestMapping("/pay")
public class PayController {
    private Log logger = LogFactory.getLog(this.getClass());
    @Autowired
    private PayService payService;

    @PostMapping(value = "request")
    public void request(@RequestBody PayRequestQuery reqData){

        HashMap tagMap = new HashMap(7);
        Gson gson = new Gson();

        // tag的id可以获取用户id
        tagMap.put("orderId", reqData.getOrderId());
        tagMap.put("req", reqData);
        logger.info("支付入参" + gson.toJson(tagMap));

//        payService.aliPay(reqData);

        tagMap.put("rep", "");
        logger.info("支付返回" + gson.toJson(tagMap));
    }
}