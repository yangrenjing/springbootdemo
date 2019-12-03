package com.yrj.code.base;

/**
 * @author ：Yangrj
 * @date ：Created in 2019/12/3 11:47
 * @description：基础枚举接口
 * @version: 1.0$
 */
public interface BaseEnum<K, V> {
    /**
     * 获取编码
     *
     * @return 编码
     */
    K code();

    /**
     * 获取描述
     *
     * @return 描述
     */
    V desc();
}
