package com.yarm.pay.controller.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}