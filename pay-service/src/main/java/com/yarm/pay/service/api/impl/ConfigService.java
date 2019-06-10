package com.yarm.pay.service.api.impl;

import com.yarm.pay.pojo.api.request.PayTypeRequest;
import com.yarm.pay.pojo.api.response.PayTypeResponse;
import com.yarm.pay.pojo.em.PayTypeCode;
import com.yarm.pay.pojo.em.ResultCode;
import com.yarm.pay.pojo.em.TradeTypeCode;
import com.yarm.pay.pojo.service.PayMerchantBO;
import com.yarm.pay.pojo.service.PayMerchantChannelBO;
import com.yarm.pay.service.api.AbstractPayService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigService extends AbstractPayService {

    public PayTypeResponse getPayTypes(PayTypeRequest request) {
        PayMerchantBO merchant = payMerchantService.getPayMerchant(request.getMerchantId());

        PayTypeResponse response = (PayTypeResponse) validate(merchant, request, PayTypeResponse.class);
        if (response != null) {
            return response;
        }

        response = new PayTypeResponse();

        List<PayMerchantChannelBO> merchantChannels;
        if (StringUtils.isNotBlank(request.getTradeType())) {
            merchantChannels = payMerchantChannelService.getPayMerchantChannel(merchant.getId(), request.getTradeType());
        } else {
            merchantChannels = payMerchantChannelService.getPayMerchantChannels(merchant.getId());
        }

        for (PayMerchantChannelBO merchantChannel : merchantChannels) {
            PayTypeCode type = PayTypeCode.getPayType(merchantChannel.getPayTypeId());
            TradeTypeCode tradeType = TradeTypeCode.getTradeTypeCode(merchantChannel.getTradeType());
            response.addPayType(type, tradeType);
        }
        response.setMerchantId(request.getMerchantId());
        response.setCode(ResultCode.SUCCESS.getValue());
        response.setMsg(ResultCode.SUCCESS.getValue());
        response.setSign(sign(response, merchant.getApiKey()));
        return response;
    }
}
