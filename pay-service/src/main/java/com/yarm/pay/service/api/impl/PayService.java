package com.yarm.pay.service.api.impl;

import com.yarm.pay.service.api.AbstractPayService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class PayService extends AbstractPayService {
    private Log logger = LogFactory.getLog(this.getClass());
}
