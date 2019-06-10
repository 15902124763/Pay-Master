package com.yarm.pay.controller.api;

import com.alibaba.fastjson.JSON;

import com.yarm.pay.pojo.api.ApiResponse;
import com.yarm.pay.pojo.api.request.PayRequest;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/10
 * Time:17:25
 * Des:
 */
@RestController
@RequestMapping("/pay")
public class PayController {
    private Log logger = LogFactory.getLog(this.getClass());


    /**
     * 扫码支付，网页支付，app支付 统一下单接口， 此接口不支持刷卡支付
     * <p/>
     * 微信扫码支付，使用模式二。
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/request", method = RequestMethod.POST)
    @ResponseBody
    public String request(HttpServletRequest request) {
        String data = null;

        PayRequest req = null;
        try {
            data = IOUtils.toString(request.getInputStream());

            logger.info("data is " + data);
            req = JSON.parseObject(data, PayRequest.class);

            // return payService.request(req).toJsonString();
            return null;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return ApiResponse.createErrorResponse(e.getMessage()).toJsonString();
        }
    }

    /***
     * 查询 订单
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @ResponseBody
    public Object query(HttpServletRequest request) {
        return null;
    }

    /***
     * 同步订单状态，与第三方支付的订单状态保持一致
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "/synchronize", method = RequestMethod.POST)
    @ResponseBody
    public Object synchronize(HttpServletRequest request) {
        return null;
    }
}