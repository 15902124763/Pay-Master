package com.yarm.pay.common.exception;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/6/10
 * Time:17:37
 * Des:支付异常
 */
public class PayException extends RuntimeException {
    public PayException() {
    }

    public PayException(String message) {
        super(message);
    }

    public PayException(String message, Throwable cause) {
        super(message, cause);
    }

    public PayException(Throwable cause) {
        super(cause);
    }
}