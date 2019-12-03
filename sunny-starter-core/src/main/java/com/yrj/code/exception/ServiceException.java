package com.yrj.code.exception;

/**
 * @author ：Yangrj
 * @date ：Created in 2019/12/3 13:55
 * @description：Service层往Controller抛出的异常
 * @version: 1.0$
 */
public class ServiceException extends BaseException {
    private static final long serialVersionUID = 6058294324031642376L;

    public ServiceException() {}

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String code, String message) {
        super(code, message);
    }
}
