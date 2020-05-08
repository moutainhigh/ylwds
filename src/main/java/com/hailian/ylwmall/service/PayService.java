package com.hailian.ylwmall.service;

import com.hailian.ylwmall.dto.pay.EnsureTradeReq;
import com.hailian.ylwmall.util.Result;
import com.kjtpay.gateway.common.domain.base.RequestBase;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface PayService {
//    RequestBase ensureTradeOld(String outTradeNo);

    RequestBase ensureTrade(EnsureTradeReq reqBean, HttpServletRequest request);

    RequestBase ensureTradePurse(EnsureTradeReq reqBean, HttpServletRequest request);

    Result ensureTradeAgreement(EnsureTradeReq reqBean, HttpServletRequest request);

    Result tradeSettle(String origOutTradeNo, Long userId);

    Result agreementPayConfirm(Long userId, String orderId, String phoneCheckCode);

    Result tradeRefund(String orderId, Long userId);

    @Transactional
    Result ensureTradeAsyncNotify(Map<String, Object> params);

    @Transactional
    Result tradeRefundAsyncNotify(Map<String, Object> params);
}
