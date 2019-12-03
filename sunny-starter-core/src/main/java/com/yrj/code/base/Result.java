package com.yrj.code.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ：Yangrj
 * @date ：Created in 2019/12/3 11:41
 * @description：前端返回参数
 * @version: 1.0$
 */
@Data
public class Result implements Serializable {
    private static final long serialVersionUID = 1430633339880116031L;

    /**
     * 成功与否标志
     */
    private boolean success = true;

    /**
     * 返回状态码，为空则默认200.前端需要拦截一些常见的状态码如403、404、500等
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer status;

    /**
     * 编码，可用于前端处理多语言，不需要则不用返回编码
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String code;

    /**
     * 相关消息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String msg;
    /**
     * 相关数据
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;


    public Result() {
    }

    public Result(boolean success) {
        this.success = success;
    }

    public Result(boolean success, Integer status) {
        this.success = success;
        this.status = status;
    }

    public Result(boolean success, String code, String msg) {
        this(success);
        this.code = code;
        this.msg = msg;
    }

    public Result(boolean success, Integer status, String code, String msg) {
        this.success = success;
        this.status = status;
        this.code = code;
        this.msg = msg;
    }

    public Result(boolean success, String code, String msg, Object data) {
        this(success);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
